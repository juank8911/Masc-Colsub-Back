package com.colsubsidio.sap.service;

import java.io.Console;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.colsubsidio.sap.interfaz.ITransDatos;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;




@ConfigurationProperties(prefix = "appli")
@Service
public class TransformacionData implements ITransDatos {

	
@Value("${my.property.s:}")
private String innerS;

@Value("${estado.estado:}")
private JSONObject estado;

@Value("${estado.tarjeta:}")
private JSONObject eTarjeta;


@Value("${tipo.tra:}")
private JSONObject trabajo;






	@Override
	public JSONObject transData(JSONObject afil)
	{
		JSONObject resp = new JSONObject();
		JSONObject auxData = new JSONObject();
		JSONArray fnData = new JSONArray();
		JSONArray data = afil.getJSONArray("data");
//		System.out.println(data);
		Iterator<String> keys = afil.keys();
		 while (keys.hasNext())
		 {
			 String key = keys.next();
//			 System.out.println(afil.get(key) instanceof JsonArray );
//			 System.out.println(afil.get(key) instanceof JsonObject);
//			 System.out.println("data".equals(key)+" data=?");
//			 System.out.println(key);
			 if (afil.get(key) instanceof JSONArray)
			 {
//				 System.out.println("es array");
				 JSONArray auxdt = afil.getJSONArray(key);
//				 System.out.println(auxdt.length());
				 for(int i=0;i<auxdt.length();i++)
				 {
					 JSONObject aux = auxdt.getJSONObject(i);
//					 System.out.println(aux instanceof JSONObject);
					 
					 if(aux instanceof JSONObject)
					 {
						 Iterator<String> keys2 = aux.keys();
						 			while (keys2.hasNext())
						 			{
						 				String key2 = keys2.next();
//						 				System.out.println(key2);
//						 				System.out.println(aux.get(key2));
//						 				System.out.println(aux.get(key2).getClass());
						 				//tratar datos de afiliado
						 				//tratar Datos de empleadores
						 				if("afiliado".equals(key2) && aux.get(key2) instanceof JSONObject)
						 				{
//						 				System.out.println("dentro del afiliados");
						 				JSONObject afilRpt = aux.getJSONObject(key2);
//						 				System.out.println(afilRpt);
//						 				JSONArray afilRt = aux.getJSONArray(key2);
						 				afilRpt = TransDatosAfili(afilRpt);
						 				auxData.put(key2,afilRpt);
						 				}
						 				if("pacs".equals(key2) && aux.get(key2) instanceof JSONArray)
						 				{
						 				JSONArray pacsRt = aux.getJSONArray(key2);
						 				pacsRt = TransDatosPacs(pacsRt);
						 				auxData.put(key2,pacsRt);
						 				}
						 			
						 			}
						 			fnData.put(auxData);
						 			resp.put("data",fnData);
					 }
					 else
					 {
//						 System.out.println("no esw objeto");
					 }
					 
				 }
			 }
			 else 
			 {
//				 System.out.println("no es array");
				 resp.put(key, afil.get(key));
				 
				 
			 }
//			 System.out.println(resp.toString());
	
			
		}
		return resp;
	}

	private JSONObject TransDatosAfili(JSONObject afilRpt) {
		// TODO Auto-generated method stub
		JSONObject resAfil = new JSONObject();
		JSONObject jsAuxAf = afilRpt.getJSONObject("afiliacion"); //auxuliar Afiliacion
		JSONObject auxMulSer = afilRpt.getJSONObject("tarjetaMultiservicios"); //auxiliar tarjeta multi
		JSONObject auxMtPa = auxMulSer.getJSONObject("metodoPago");
		resAfil.put("nombre", afilRpt.get("primerNombre")+" "+afilRpt.get("segundoNombre")+" "+afilRpt.get("primerApellido")+" "+afilRpt.get("segundoApellido"));
		resAfil.put("fechaNacimiento", afilRpt.get("fechaNacimiento"));
//		System.out.println(jsAuxAf);
		resAfil.put("fechaAfiliacion", jsAuxAf.get("fechaAfiliacion"));
		String estd = convertirEstado(afilRpt.get("estado").toString(), estado);
		resAfil.put("estado",estd);
		resAfil.put("fechaAfiliacion", jsAuxAf.get("fechaRetiro"));
		resAfil.put("categoria", jsAuxAf.get("categoria"));
		String tipoTr = convertirEstado(jsAuxAf.get("tipoTrabajador").toString(), trabajo);
		resAfil.put("tipoTrabajador", tipoTr);
		resAfil.put("tarjetaMultiservicios",auxMulSer.get("numeroTarjeta"));
		resAfil.put("gp",auxMulSer.get("gp"));
		String eEntre = convertirEstado(auxMulSer.get("estadoEntrega").toString(), eTarjeta);
		resAfil.put("estadoEntrega",eEntre);
		resAfil.put("fechaEntrega",auxMulSer.get("fechaEntrega"));
		resAfil.put("subsidio", jsAuxAf.get("subsidio"));
		resAfil.put("ultimoMesPagado",auxMulSer.get("ultimoMesPagado"));
		resAfil.put("metodoPago", auxMtPa.get("nombre"));
		resAfil.put("motivoBloqueo", auxMulSer.get("motivoBloqueo"));
		resAfil.put("porcentajeApor", jsAuxAf.get("porcentajeAporte")+"%");
		resAfil.put("fechaRetiro", jsAuxAf.get("fechaRetiro"));
		resAfil.put("numeroDocumento", afilRpt.get("numeroDocumento"));
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(resAfil);
		return resAfil;
	}

	private JSONArray TransDatosPacs(JSONArray pacs) {
		// TODO Auto-generated method stub
		JSONArray respPacs = new JSONArray();
			for(int i=0;i<pacs.length();i++)
			{
//				JsonObject  = new JsonObject();
				JSONObject JsoBenf = new JSONObject();
//				JsoBenf.addProperty("token", currentTokenNo.replaceAll("\"","").replaceAll("/","")); 
				JSONObject auxPac = pacs.getJSONObject(i);
//				JsoBenf.put("documento", "1234");
//				System.out.println(auxPac.toString());		
				JsoBenf.put("numeroDocumento", (String) auxPac.get("numeroDocumento"));
				JsoBenf.put("bNombre", auxPac.get("primerNombre") +" "+auxPac.get("segundoNombre")+" "+auxPac.get("apellido")+" "+auxPac.get("segundoApellido"));
				JSONObject relacion = auxPac.getJSONObject("relacion");
				JsoBenf.put("relacion", (String) relacion.get("descripcion"));
				JsoBenf.put("genero", auxPac.get("genero").toString().equals("1")?"Femenino":"Masculino");
				try {
					convertirFecha(auxPac.get("fechaNacimiento").toString());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JsoBenf.put("fechaNacimineto", auxPac.get("fechaNacimiento"));
				JsoBenf.put("fechaInicioVigencia", auxPac.get("fechaInicioVigencia"));
				String estd = convertirEstado(auxPac.get("estado").toString(), estado);
				JsoBenf.put("estado", estd);
				JsoBenf.put("discapacidad", auxPac.getString("discapacidad").equals("null")?"":auxPac.getString("discapacidad"));
				
				
//				System.out.println(JsoBenf);
				respPacs.put(JsoBenf);
			}
//			System.out.println(respPacs);	
		return respPacs;
	}
	
	
	//este metodo necesito que lo realices 
	public void convertirFecha(String fecha) throws  ParseException
	{
		System.out.println(fecha);
		String fh = "1953-09-25";
		SimpleDateFormat formato = new SimpleDateFormat("DD-MM-YYYY"); 
		Date fecha1 = formato.parse(fh);
		System.out.println("dentro de convertir fecha");
		System.out.println(fecha1.toString());
	}
	
	public String convertirEstado(String estadoAp, JSONObject estYml)
	{
		String estad = estYml.get(estadoAp).toString();
		return estad;
	}

	@Override
	public void transDEmp(JSONObject emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
