package com.colsubsidio.sap.apigee;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class ApigeeAfiliadoResDTO {
	    private int estado;
	    private String mensaje;
	   	   
	    @JsonProperty("data.afiliado")
	    private String bp;
	    @JsonProperty("data.afiliado")
	    private String numeroDocumento;
	    @JsonProperty("data.afiliado")
	    private String tipoDocumento;
	    @JsonProperty("data.afiliado")
	    private String primerNombre;
	    @JsonProperty("data.afiliado")
	    private String segundoNombre;
	    @JsonProperty("data.afiliado")
	    private String primerApellido;
	    @JsonProperty("data.afiliado")
	    private String segundoApellido;
	    @JsonProperty("data.afiliado")
	    private String fechaNacimiento;
	    @JsonProperty("data.afiliado")
	    private String edad;
	    @JsonProperty("data.afiliado")
	    private String genero;
	    @JsonProperty("data.afiliado")
	    private String estadoCivil;
	    @JsonProperty("data.afiliado")
	    private String personasACargo;
	    @JsonProperty("data.afiliado")
	    private String nivelEducativo;
	    @JsonProperty("data.afiliado")
	    private String telefono;
	    @JsonProperty("data.afiliado")
	    private String motivoRetiro;
	    @JsonProperty("data.afiliado.direccion.pais")
	    private String pais_id;
	    @JsonProperty("data.afiliado.direccion.pais")
	    private String pais_nombre;
	    @JsonProperty("data.afiliado.direccion.departamento")
	    private String departamento_id;
	    @JsonProperty("data.afiliado.direccion.departamento")
	    private String departamento_nombre;
	    @JsonProperty("data.afiliado.direccion.ciudad")
	    private String ciudad_id;
	    @JsonProperty("data.afiliado.direccion.ciudad")
	    private String ciudad_nombre;
	    @JsonProperty("data.afiliado.direccion.localidad")
	    private String localidad_id;
	    @JsonProperty("data.afiliado.direccion")
	    private String direccionPrincipal;
	    @JsonProperty("data.afiliado.direccion")
	    private String direccionSecundaria;
	    @JsonProperty("data.afiliado.empresa.cargo")
	    private String descripcion;
	    @JsonProperty("data.afiliado.empresa")
	    private String simultaneas;
	    @JsonProperty("data.afiliado.alcaldia")
	    private String codigo;
	    @JsonProperty("data.afiliado")
	    private String tarifa;
	    @JsonProperty("data.afiliado")
	    private String estado_afil;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String fechaAfiliacion;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String categoria;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String grupo;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String tipoSalario;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String salario;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String salarioOtros;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String fechaRetiro;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String tipoCargo;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String horasLaboradas;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String tipoTrabajador;
	    @JsonProperty("data.afiliado.empleadores")
	    private String empleadoresConcurrentes;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String bp_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String tipoDocumento_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String numberoDocumento;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String nombre;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String tipoAportante;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String tipoPersona;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String claserAportante;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaInicioActividad;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String estado_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaIngresoAfiliado;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaInicioVigencia;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaFinVigencia;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String salario_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String sucursal;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String agrupacion;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String localidad;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String empresaPrincipal;
	    @JsonProperty("data.afiliado.pacs")
	    private String bp_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String tipoDocumento_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String numeroDocumento_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String primerNombre_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String segundoNombre_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String apellido_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String segundoApellido_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String edad_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String genero_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaNacimiento_pac;
	    @JsonProperty("data.afiliado.pacs.relacion")
	    private String codigo_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaInicioVigencia_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaFinVigencia_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaRegistroRetiro;
	    @JsonProperty("data.afiliado.pacs")
	    private String discapacidad;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaLimiteComprobanteNutricional;
	    @JsonProperty("data.afiliado.pacs.documentacion")
	    private String motivoBloqueo;
	    @JsonProperty("data.afiliado.pacs.documentacion")
	    private String bloqueo;
	    @JsonProperty("data.afiliado.pacs.documentacion")
	    private String descripcionBloqueo;
	    @JsonProperty("data.afiliado.pacs.subsidio")
	    private String valor;
	    @JsonProperty("data.afiliado.pacs.subsidio")
	    private String tipoEntrega;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String primerNombre_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String segundoNombre_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String apellido;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String segundoApellido_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.documento")
	    private String numero_doc_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.documento")
	    private String tipo_doc;
	    @JsonProperty("data.afiliado.pacs.tarjeta")
	    private String numero;
	    @JsonProperty("data.afiliado.pacs.tarjeta")
	    private String estado_tar_pac;
	    @JsonProperty("data.afiliado.pacs.tarjeta")
	    private String lote;
	    @JsonProperty("data.afiliado.pacs.cuotaMonetaria")
	    private String motivoBloqueo_cuo;
	    @JsonProperty("data.afiliado.pacs.cuotaMonetaria")
	    private String salario_cuo;
	    @JsonProperty("data.afiliado.pacs.cuotaMonetaria")
	    private String categoriaSalarial;
	    @JsonProperty("data.afiliado.pacs")
	    private String comprobanteNutricional;
	    @JsonProperty("data.afiliado.pacs")
	    private String nivelEducativo_pac;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String descripcion_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String nombre_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.documento")
	    private String numero_doc_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.documento")
	    private String tipo_doc_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String fechaPersona;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String fechaRegistro;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String indicadorPersona;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String causaRetiro;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico")
	    private String descripcion_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String primerNombre_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String segundoNombre_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String apellido_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String segundoApellido_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.documento")
	    private String numero_doc_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.documento")
	    private String tipo_doc_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String estado_ins_pac;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String tieneCuotaMonetaria;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String lugarEntrega;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String valorUltimoSubsidio;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String monto;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String lote_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String numeroTarjeta;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String serialProximidad;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String gp;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String estado_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String fechaEntrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String estadoEntrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String entrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String fechaExpedicion;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String causaCambio;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String ultimoMesPagado;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String motivoBloqueo_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.metodoPago")
	    private String id;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.metodoPago")
	    private String nombre_met_pag;
		public int getEstado() {
			return estado;
		}
		public void setEstado(int estado) {
			this.estado = estado;
		}
		public String getMensaje() {
			return mensaje;
		}
		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		public String getBp() {
			return bp;
		}
		public void setBp(String bp) {
			this.bp = bp;
		}
		public String getNumeroDocumento() {
			return numeroDocumento;
		}
		public void setNumeroDocumento(String numeroDocumento) {
			this.numeroDocumento = numeroDocumento;
		}
		public String getTipoDocumento() {
			return tipoDocumento;
		}
		public void setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}
		public String getPrimerNombre() {
			return primerNombre;
		}
		public void setPrimerNombre(String primerNombre) {
			this.primerNombre = primerNombre;
		}
		public String getSegundoNombre() {
			return segundoNombre;
		}
		public void setSegundoNombre(String segundoNombre) {
			this.segundoNombre = segundoNombre;
		}
		public String getPrimerApellido() {
			return primerApellido;
		}
		public void setPrimerApellido(String primerApellido) {
			this.primerApellido = primerApellido;
		}
		public String getSegundoApellido() {
			return segundoApellido;
		}
		public void setSegundoApellido(String segundoApellido) {
			this.segundoApellido = segundoApellido;
		}
		public String getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getEdad() {
			return edad;
		}
		public void setEdad(String edad) {
			this.edad = edad;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getEstadoCivil() {
			return estadoCivil;
		}
		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		public String getPersonasACargo() {
			return personasACargo;
		}
		public void setPersonasACargo(String personasACargo) {
			this.personasACargo = personasACargo;
		}
		public String getNivelEducativo() {
			return nivelEducativo;
		}
		public void setNivelEducativo(String nivelEducativo) {
			this.nivelEducativo = nivelEducativo;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getMotivoRetiro() {
			return motivoRetiro;
		}
		public void setMotivoRetiro(String motivoRetiro) {
			this.motivoRetiro = motivoRetiro;
		}
		public String getPais_id() {
			return pais_id;
		}
		public void setPais_id(String pais_id) {
			this.pais_id = pais_id;
		}
		public String getPais_nombre() {
			return pais_nombre;
		}
		public void setPais_nombre(String pais_nombre) {
			this.pais_nombre = pais_nombre;
		}
		public String getDepartamento_id() {
			return departamento_id;
		}
		public void setDepartamento_id(String departamento_id) {
			this.departamento_id = departamento_id;
		}
		public String getDepartamento_nombre() {
			return departamento_nombre;
		}
		public void setDepartamento_nombre(String departamento_nombre) {
			this.departamento_nombre = departamento_nombre;
		}
		public String getCiudad_id() {
			return ciudad_id;
		}
		public void setCiudad_id(String ciudad_id) {
			this.ciudad_id = ciudad_id;
		}
		public String getCiudad_nombre() {
			return ciudad_nombre;
		}
		public void setCiudad_nombre(String ciudad_nombre) {
			this.ciudad_nombre = ciudad_nombre;
		}
		public String getLocalidad_id() {
			return localidad_id;
		}
		public void setLocalidad_id(String localidad_id) {
			this.localidad_id = localidad_id;
		}
		public String getDireccionPrincipal() {
			return direccionPrincipal;
		}
		public void setDireccionPrincipal(String direccionPrincipal) {
			this.direccionPrincipal = direccionPrincipal;
		}
		public String getDireccionSecundaria() {
			return direccionSecundaria;
		}
		public void setDireccionSecundaria(String direccionSecundaria) {
			this.direccionSecundaria = direccionSecundaria;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getSimultaneas() {
			return simultaneas;
		}
		public void setSimultaneas(String simultaneas) {
			this.simultaneas = simultaneas;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getTarifa() {
			return tarifa;
		}
		public void setTarifa(String tarifa) {
			this.tarifa = tarifa;
		}
		public String getEstado_afil() {
			return estado_afil;
		}
		public void setEstado_afil(String estado_afil) {
			this.estado_afil = estado_afil;
		}
		public String getFechaAfiliacion() {
			return fechaAfiliacion;
		}
		public void setFechaAfiliacion(String fechaAfiliacion) {
			this.fechaAfiliacion = fechaAfiliacion;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public String getGrupo() {
			return grupo;
		}
		public void setGrupo(String grupo) {
			this.grupo = grupo;
		}
		public String getTipoSalario() {
			return tipoSalario;
		}
		public void setTipoSalario(String tipoSalario) {
			this.tipoSalario = tipoSalario;
		}
		public String getSalario() {
			return salario;
		}
		public void setSalario(String salario) {
			this.salario = salario;
		}
		public String getSalarioOtros() {
			return salarioOtros;
		}
		public void setSalarioOtros(String salarioOtros) {
			this.salarioOtros = salarioOtros;
		}
		public String getFechaRetiro() {
			return fechaRetiro;
		}
		public void setFechaRetiro(String fechaRetiro) {
			this.fechaRetiro = fechaRetiro;
		}
		public String getTipoCargo() {
			return tipoCargo;
		}
		public void setTipoCargo(String tipoCargo) {
			this.tipoCargo = tipoCargo;
		}
		public String getHorasLaboradas() {
			return horasLaboradas;
		}
		public void setHorasLaboradas(String horasLaboradas) {
			this.horasLaboradas = horasLaboradas;
		}
		public String getTipoTrabajador() {
			return tipoTrabajador;
		}
		public void setTipoTrabajador(String tipoTrabajador) {
			this.tipoTrabajador = tipoTrabajador;
		}
		public String getEmpleadoresConcurrentes() {
			return empleadoresConcurrentes;
		}
		public void setEmpleadoresConcurrentes(String empleadoresConcurrentes) {
			this.empleadoresConcurrentes = empleadoresConcurrentes;
		}
		public String getBp_com() {
			return bp_com;
		}
		public void setBp_com(String bp_com) {
			this.bp_com = bp_com;
		}
		public String getTipoDocumento_com() {
			return tipoDocumento_com;
		}
		public void setTipoDocumento_com(String tipoDocumento_com) {
			this.tipoDocumento_com = tipoDocumento_com;
		}
		public String getNumberoDocumento() {
			return numberoDocumento;
		}
		public void setNumberoDocumento(String numberoDocumento) {
			this.numberoDocumento = numberoDocumento;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTipoAportante() {
			return tipoAportante;
		}
		public void setTipoAportante(String tipoAportante) {
			this.tipoAportante = tipoAportante;
		}
		public String getTipoPersona() {
			return tipoPersona;
		}
		public void setTipoPersona(String tipoPersona) {
			this.tipoPersona = tipoPersona;
		}
		public String getClaserAportante() {
			return claserAportante;
		}
		public void setClaserAportante(String claserAportante) {
			this.claserAportante = claserAportante;
		}
		public String getFechaInicioActividad() {
			return fechaInicioActividad;
		}
		public void setFechaInicioActividad(String fechaInicioActividad) {
			this.fechaInicioActividad = fechaInicioActividad;
		}
		public String getEstado_com() {
			return estado_com;
		}
		public void setEstado_com(String estado_com) {
			this.estado_com = estado_com;
		}
		public String getFechaIngresoAfiliado() {
			return fechaIngresoAfiliado;
		}
		public void setFechaIngresoAfiliado(String fechaIngresoAfiliado) {
			this.fechaIngresoAfiliado = fechaIngresoAfiliado;
		}
		public String getFechaInicioVigencia() {
			return fechaInicioVigencia;
		}
		public void setFechaInicioVigencia(String fechaInicioVigencia) {
			this.fechaInicioVigencia = fechaInicioVigencia;
		}
		public String getFechaFinVigencia() {
			return fechaFinVigencia;
		}
		public void setFechaFinVigencia(String fechaFinVigencia) {
			this.fechaFinVigencia = fechaFinVigencia;
		}
		public String getSalario_com() {
			return salario_com;
		}
		public void setSalario_com(String salario_com) {
			this.salario_com = salario_com;
		}
		public String getSucursal() {
			return sucursal;
		}
		public void setSucursal(String sucursal) {
			this.sucursal = sucursal;
		}
		public String getAgrupacion() {
			return agrupacion;
		}
		public void setAgrupacion(String agrupacion) {
			this.agrupacion = agrupacion;
		}
		public String getLocalidad() {
			return localidad;
		}
		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}
		public String getEmpresaPrincipal() {
			return empresaPrincipal;
		}
		public void setEmpresaPrincipal(String empresaPrincipal) {
			this.empresaPrincipal = empresaPrincipal;
		}
		public String getBp_pac() {
			return bp_pac;
		}
		public void setBp_pac(String bp_pac) {
			this.bp_pac = bp_pac;
		}
		public String getTipoDocumento_pac() {
			return tipoDocumento_pac;
		}
		public void setTipoDocumento_pac(String tipoDocumento_pac) {
			this.tipoDocumento_pac = tipoDocumento_pac;
		}
		public String getNumeroDocumento_pac() {
			return numeroDocumento_pac;
		}
		public void setNumeroDocumento_pac(String numeroDocumento_pac) {
			this.numeroDocumento_pac = numeroDocumento_pac;
		}
		public String getPrimerNombre_pac() {
			return primerNombre_pac;
		}
		public void setPrimerNombre_pac(String primerNombre_pac) {
			this.primerNombre_pac = primerNombre_pac;
		}
		public String getSegundoNombre_pac() {
			return segundoNombre_pac;
		}
		public void setSegundoNombre_pac(String segundoNombre_pac) {
			this.segundoNombre_pac = segundoNombre_pac;
		}
		public String getApellido_pac() {
			return apellido_pac;
		}
		public void setApellido_pac(String apellido_pac) {
			this.apellido_pac = apellido_pac;
		}
		public String getSegundoApellido_pac() {
			return segundoApellido_pac;
		}
		public void setSegundoApellido_pac(String segundoApellido_pac) {
			this.segundoApellido_pac = segundoApellido_pac;
		}
		public String getEdad_pac() {
			return edad_pac;
		}
		public void setEdad_pac(String edad_pac) {
			this.edad_pac = edad_pac;
		}
		public String getGenero_pac() {
			return genero_pac;
		}
		public void setGenero_pac(String genero_pac) {
			this.genero_pac = genero_pac;
		}
		public String getFechaNacimiento_pac() {
			return fechaNacimiento_pac;
		}
		public void setFechaNacimiento_pac(String fechaNacimiento_pac) {
			this.fechaNacimiento_pac = fechaNacimiento_pac;
		}
		public String getCodigo_pac() {
			return codigo_pac;
		}
		public void setCodigo_pac(String codigo_pac) {
			this.codigo_pac = codigo_pac;
		}
		public String getFechaInicioVigencia_pac() {
			return fechaInicioVigencia_pac;
		}
		public void setFechaInicioVigencia_pac(String fechaInicioVigencia_pac) {
			this.fechaInicioVigencia_pac = fechaInicioVigencia_pac;
		}
		public String getFechaFinVigencia_pac() {
			return fechaFinVigencia_pac;
		}
		public void setFechaFinVigencia_pac(String fechaFinVigencia_pac) {
			this.fechaFinVigencia_pac = fechaFinVigencia_pac;
		}
		public String getFechaRegistroRetiro() {
			return fechaRegistroRetiro;
		}
		public void setFechaRegistroRetiro(String fechaRegistroRetiro) {
			this.fechaRegistroRetiro = fechaRegistroRetiro;
		}
		public String getDiscapacidad() {
			return discapacidad;
		}
		public void setDiscapacidad(String discapacidad) {
			this.discapacidad = discapacidad;
		}
		public String getFechaLimiteComprobanteNutricional() {
			return fechaLimiteComprobanteNutricional;
		}
		public void setFechaLimiteComprobanteNutricional(String fechaLimiteComprobanteNutricional) {
			this.fechaLimiteComprobanteNutricional = fechaLimiteComprobanteNutricional;
		}
		public String getMotivoBloqueo() {
			return motivoBloqueo;
		}
		public void setMotivoBloqueo(String motivoBloqueo) {
			this.motivoBloqueo = motivoBloqueo;
		}
		public String getBloqueo() {
			return bloqueo;
		}
		public void setBloqueo(String bloqueo) {
			this.bloqueo = bloqueo;
		}
		public String getDescripcionBloqueo() {
			return descripcionBloqueo;
		}
		public void setDescripcionBloqueo(String descripcionBloqueo) {
			this.descripcionBloqueo = descripcionBloqueo;
		}
		public String getValor() {
			return valor;
		}
		public void setValor(String valor) {
			this.valor = valor;
		}
		public String getTipoEntrega() {
			return tipoEntrega;
		}
		public void setTipoEntrega(String tipoEntrega) {
			this.tipoEntrega = tipoEntrega;
		}
		public String getPrimerNombre_adm() {
			return primerNombre_adm;
		}
		public void setPrimerNombre_adm(String primerNombre_adm) {
			this.primerNombre_adm = primerNombre_adm;
		}
		public String getSegundoNombre_adm() {
			return segundoNombre_adm;
		}
		public void setSegundoNombre_adm(String segundoNombre_adm) {
			this.segundoNombre_adm = segundoNombre_adm;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getSegundoApellido_adm() {
			return segundoApellido_adm;
		}
		public void setSegundoApellido_adm(String segundoApellido_adm) {
			this.segundoApellido_adm = segundoApellido_adm;
		}
		public String getNumero_doc_adm() {
			return numero_doc_adm;
		}
		public void setNumero_doc_adm(String numero_doc_adm) {
			this.numero_doc_adm = numero_doc_adm;
		}
		public String getTipo_doc() {
			return tipo_doc;
		}
		public void setTipo_doc(String tipo_doc) {
			this.tipo_doc = tipo_doc;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getEstado_tar_pac() {
			return estado_tar_pac;
		}
		public void setEstado_tar_pac(String estado_tar_pac) {
			this.estado_tar_pac = estado_tar_pac;
		}
		public String getLote() {
			return lote;
		}
		public void setLote(String lote) {
			this.lote = lote;
		}
		public String getMotivoBloqueo_cuo() {
			return motivoBloqueo_cuo;
		}
		public void setMotivoBloqueo_cuo(String motivoBloqueo_cuo) {
			this.motivoBloqueo_cuo = motivoBloqueo_cuo;
		}
		public String getSalario_cuo() {
			return salario_cuo;
		}
		public void setSalario_cuo(String salario_cuo) {
			this.salario_cuo = salario_cuo;
		}
		public String getCategoriaSalarial() {
			return categoriaSalarial;
		}
		public void setCategoriaSalarial(String categoriaSalarial) {
			this.categoriaSalarial = categoriaSalarial;
		}
		public String getComprobanteNutricional() {
			return comprobanteNutricional;
		}
		public void setComprobanteNutricional(String comprobanteNutricional) {
			this.comprobanteNutricional = comprobanteNutricional;
		}
		public String getNivelEducativo_pac() {
			return nivelEducativo_pac;
		}
		public void setNivelEducativo_pac(String nivelEducativo_pac) {
			this.nivelEducativo_pac = nivelEducativo_pac;
		}
		public String getDescripcion_ins() {
			return descripcion_ins;
		}
		public void setDescripcion_ins(String descripcion_ins) {
			this.descripcion_ins = descripcion_ins;
		}
		public String getNombre_ins() {
			return nombre_ins;
		}
		public void setNombre_ins(String nombre_ins) {
			this.nombre_ins = nombre_ins;
		}
		public String getNumero_doc_ins() {
			return numero_doc_ins;
		}
		public void setNumero_doc_ins(String numero_doc_ins) {
			this.numero_doc_ins = numero_doc_ins;
		}
		public String getTipo_doc_ins() {
			return tipo_doc_ins;
		}
		public void setTipo_doc_ins(String tipo_doc_ins) {
			this.tipo_doc_ins = tipo_doc_ins;
		}
		public String getFechaPersona() {
			return fechaPersona;
		}
		public void setFechaPersona(String fechaPersona) {
			this.fechaPersona = fechaPersona;
		}
		public String getFechaRegistro() {
			return fechaRegistro;
		}
		public void setFechaRegistro(String fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}
		public String getIndicadorPersona() {
			return indicadorPersona;
		}
		public void setIndicadorPersona(String indicadorPersona) {
			this.indicadorPersona = indicadorPersona;
		}
		public String getCausaRetiro() {
			return causaRetiro;
		}
		public void setCausaRetiro(String causaRetiro) {
			this.causaRetiro = causaRetiro;
		}
		public String getDescripcion_bio() {
			return descripcion_bio;
		}
		public void setDescripcion_bio(String descripcion_bio) {
			this.descripcion_bio = descripcion_bio;
		}
		public String getPrimerNombre_bio() {
			return primerNombre_bio;
		}
		public void setPrimerNombre_bio(String primerNombre_bio) {
			this.primerNombre_bio = primerNombre_bio;
		}
		public String getSegundoNombre_bio() {
			return segundoNombre_bio;
		}
		public void setSegundoNombre_bio(String segundoNombre_bio) {
			this.segundoNombre_bio = segundoNombre_bio;
		}
		public String getApellido_bio() {
			return apellido_bio;
		}
		public void setApellido_bio(String apellido_bio) {
			this.apellido_bio = apellido_bio;
		}
		public String getSegundoApellido_bio() {
			return segundoApellido_bio;
		}
		public void setSegundoApellido_bio(String segundoApellido_bio) {
			this.segundoApellido_bio = segundoApellido_bio;
		}
		public String getNumero_doc_bio() {
			return numero_doc_bio;
		}
		public void setNumero_doc_bio(String numero_doc_bio) {
			this.numero_doc_bio = numero_doc_bio;
		}
		public String getTipo_doc_bio() {
			return tipo_doc_bio;
		}
		public void setTipo_doc_bio(String tipo_doc_bio) {
			this.tipo_doc_bio = tipo_doc_bio;
		}
		public String getEstado_ins_pac() {
			return estado_ins_pac;
		}
		public void setEstado_ins_pac(String estado_ins_pac) {
			this.estado_ins_pac = estado_ins_pac;
		}
		public String getTieneCuotaMonetaria() {
			return tieneCuotaMonetaria;
		}
		public void setTieneCuotaMonetaria(String tieneCuotaMonetaria) {
			this.tieneCuotaMonetaria = tieneCuotaMonetaria;
		}
		public String getLugarEntrega() {
			return lugarEntrega;
		}
		public void setLugarEntrega(String lugarEntrega) {
			this.lugarEntrega = lugarEntrega;
		}
		public String getValorUltimoSubsidio() {
			return valorUltimoSubsidio;
		}
		public void setValorUltimoSubsidio(String valorUltimoSubsidio) {
			this.valorUltimoSubsidio = valorUltimoSubsidio;
		}
		public String getMonto() {
			return monto;
		}
		public void setMonto(String monto) {
			this.monto = monto;
		}
		public String getLote_tar() {
			return lote_tar;
		}
		public void setLote_tar(String lote_tar) {
			this.lote_tar = lote_tar;
		}
		public String getNumeroTarjeta() {
			return numeroTarjeta;
		}
		public void setNumeroTarjeta(String numeroTarjeta) {
			this.numeroTarjeta = numeroTarjeta;
		}
		public String getSerialProximidad() {
			return serialProximidad;
		}
		public void setSerialProximidad(String serialProximidad) {
			this.serialProximidad = serialProximidad;
		}
		public String getGp() {
			return gp;
		}
		public void setGp(String gp) {
			this.gp = gp;
		}
		public String getEstado_tar() {
			return estado_tar;
		}
		public void setEstado_tar(String estado_tar) {
			this.estado_tar = estado_tar;
		}
		public String getFechaEntrega() {
			return fechaEntrega;
		}
		public void setFechaEntrega(String fechaEntrega) {
			this.fechaEntrega = fechaEntrega;
		}
		public String getEstadoEntrega() {
			return estadoEntrega;
		}
		public void setEstadoEntrega(String estadoEntrega) {
			this.estadoEntrega = estadoEntrega;
		}
		public String getEntrega() {
			return entrega;
		}
		public void setEntrega(String entrega) {
			this.entrega = entrega;
		}
		public String getFechaExpedicion() {
			return fechaExpedicion;
		}
		public void setFechaExpedicion(String fechaExpedicion) {
			this.fechaExpedicion = fechaExpedicion;
		}
		public String getCausaCambio() {
			return causaCambio;
		}
		public void setCausaCambio(String causaCambio) {
			this.causaCambio = causaCambio;
		}
		public String getUltimoMesPagado() {
			return ultimoMesPagado;
		}
		public void setUltimoMesPagado(String ultimoMesPagado) {
			this.ultimoMesPagado = ultimoMesPagado;
		}
		public String getMotivoBloqueo_tar() {
			return motivoBloqueo_tar;
		}
		public void setMotivoBloqueo_tar(String motivoBloqueo_tar) {
			this.motivoBloqueo_tar = motivoBloqueo_tar;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getNombre_met_pag() {
			return nombre_met_pag;
		}
		public void setNombre_met_pag(String nombre_met_pag) {
			this.nombre_met_pag = nombre_met_pag;
		}
		@Override
		public String toString() {
			return "ApigeeAfiliadoResDTO [estado=" + estado + ", mensaje=" + mensaje + ", bp=" + bp
					+ ", numeroDocumento=" + numeroDocumento + ", tipoDocumento=" + tipoDocumento + ", primerNombre="
					+ primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido
					+ ", segundoApellido=" + segundoApellido + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad
					+ ", genero=" + genero + ", estadoCivil=" + estadoCivil + ", personasACargo=" + personasACargo
					+ ", nivelEducativo=" + nivelEducativo + ", telefono=" + telefono + ", motivoRetiro=" + motivoRetiro
					+ ", pais_id=" + pais_id + ", pais_nombre=" + pais_nombre + ", departamento_id=" + departamento_id
					+ ", departamento_nombre=" + departamento_nombre + ", ciudad_id=" + ciudad_id + ", ciudad_nombre="
					+ ciudad_nombre + ", localidad_id=" + localidad_id + ", direccionPrincipal=" + direccionPrincipal
					+ ", direccionSecundaria=" + direccionSecundaria + ", descripcion=" + descripcion + ", simultaneas="
					+ simultaneas + ", codigo=" + codigo + ", tarifa=" + tarifa + ", estado_afil=" + estado_afil
					+ ", fechaAfiliacion=" + fechaAfiliacion + ", categoria=" + categoria + ", grupo=" + grupo
					+ ", tipoSalario=" + tipoSalario + ", salario=" + salario + ", salarioOtros=" + salarioOtros
					+ ", fechaRetiro=" + fechaRetiro + ", tipoCargo=" + tipoCargo + ", horasLaboradas=" + horasLaboradas
					+ ", tipoTrabajador=" + tipoTrabajador + ", empleadoresConcurrentes=" + empleadoresConcurrentes
					+ ", bp_com=" + bp_com + ", tipoDocumento_com=" + tipoDocumento_com + ", numberoDocumento="
					+ numberoDocumento + ", nombre=" + nombre + ", tipoAportante=" + tipoAportante + ", tipoPersona="
					+ tipoPersona + ", claserAportante=" + claserAportante + ", fechaInicioActividad="
					+ fechaInicioActividad + ", estado_com=" + estado_com + ", fechaIngresoAfiliado="
					+ fechaIngresoAfiliado + ", fechaInicioVigencia=" + fechaInicioVigencia + ", fechaFinVigencia="
					+ fechaFinVigencia + ", salario_com=" + salario_com + ", sucursal=" + sucursal + ", agrupacion="
					+ agrupacion + ", localidad=" + localidad + ", empresaPrincipal=" + empresaPrincipal + ", bp_pac="
					+ bp_pac + ", tipoDocumento_pac=" + tipoDocumento_pac + ", numeroDocumento_pac="
					+ numeroDocumento_pac + ", primerNombre_pac=" + primerNombre_pac + ", segundoNombre_pac="
					+ segundoNombre_pac + ", apellido_pac=" + apellido_pac + ", segundoApellido_pac="
					+ segundoApellido_pac + ", edad_pac=" + edad_pac + ", genero_pac=" + genero_pac
					+ ", fechaNacimiento_pac=" + fechaNacimiento_pac + ", codigo_pac=" + codigo_pac
					+ ", fechaInicioVigencia_pac=" + fechaInicioVigencia_pac + ", fechaFinVigencia_pac="
					+ fechaFinVigencia_pac + ", fechaRegistroRetiro=" + fechaRegistroRetiro + ", discapacidad="
					+ discapacidad + ", fechaLimiteComprobanteNutricional=" + fechaLimiteComprobanteNutricional
					+ ", motivoBloqueo=" + motivoBloqueo + ", bloqueo=" + bloqueo + ", descripcionBloqueo="
					+ descripcionBloqueo + ", valor=" + valor + ", tipoEntrega=" + tipoEntrega + ", primerNombre_adm="
					+ primerNombre_adm + ", segundoNombre_adm=" + segundoNombre_adm + ", apellido=" + apellido
					+ ", segundoApellido_adm=" + segundoApellido_adm + ", numero_doc_adm=" + numero_doc_adm
					+ ", tipo_doc=" + tipo_doc + ", numero=" + numero + ", estado_tar_pac=" + estado_tar_pac + ", lote="
					+ lote + ", motivoBloqueo_cuo=" + motivoBloqueo_cuo + ", salario_cuo=" + salario_cuo
					+ ", categoriaSalarial=" + categoriaSalarial + ", comprobanteNutricional=" + comprobanteNutricional
					+ ", nivelEducativo_pac=" + nivelEducativo_pac + ", descripcion_ins=" + descripcion_ins
					+ ", nombre_ins=" + nombre_ins + ", numero_doc_ins=" + numero_doc_ins + ", tipo_doc_ins="
					+ tipo_doc_ins + ", fechaPersona=" + fechaPersona + ", fechaRegistro=" + fechaRegistro
					+ ", indicadorPersona=" + indicadorPersona + ", causaRetiro=" + causaRetiro + ", descripcion_bio="
					+ descripcion_bio + ", primerNombre_bio=" + primerNombre_bio + ", segundoNombre_bio="
					+ segundoNombre_bio + ", apellido_bio=" + apellido_bio + ", segundoApellido_bio="
					+ segundoApellido_bio + ", numero_doc_bio=" + numero_doc_bio + ", tipo_doc_bio=" + tipo_doc_bio
					+ ", estado_ins_pac=" + estado_ins_pac + ", tieneCuotaMonetaria=" + tieneCuotaMonetaria
					+ ", lugarEntrega=" + lugarEntrega + ", valorUltimoSubsidio=" + valorUltimoSubsidio + ", monto="
					+ monto + ", lote_tar=" + lote_tar + ", numeroTarjeta=" + numeroTarjeta + ", serialProximidad="
					+ serialProximidad + ", gp=" + gp + ", estado_tar=" + estado_tar + ", fechaEntrega=" + fechaEntrega
					+ ", estadoEntrega=" + estadoEntrega + ", entrega=" + entrega + ", fechaExpedicion="
					+ fechaExpedicion + ", causaCambio=" + causaCambio + ", ultimoMesPagado=" + ultimoMesPagado
					+ ", motivoBloqueo_tar=" + motivoBloqueo_tar + ", id=" + id + ", nombre_met_pag=" + nombre_met_pag
					+ "]";
		}
	    
	    
	    
}
