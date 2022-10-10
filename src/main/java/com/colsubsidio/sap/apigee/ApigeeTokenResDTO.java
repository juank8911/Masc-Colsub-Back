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
public class ApigeeTokenResDTO {
    
    private String refresh_token_expires_in;
    private String api_product_list;
    private List<String> api_product_list_json;
    private String organization_name;
    @JsonProperty("developer.email")
    private String developer_email;
    private String token_type;
    private String issued_at;
    private String client_id;
    private String access_token;
    private String application_name;
    private String scope;
    private String expires_in;
    private String refresh_count;
    private String status;
	public String getRefresh_token_expires_in() {
		return refresh_token_expires_in;
	}
	public void setRefresh_token_expires_in(String refresh_token_expires_in) {
		this.refresh_token_expires_in = refresh_token_expires_in;
	}
	public String getApi_product_list() {
		return api_product_list;
	}
	public void setApi_product_list(String api_product_list) {
		this.api_product_list = api_product_list;
	}
	public List<String> getApi_product_list_json() {
		return api_product_list_json;
	}
	public void setApi_product_list_json(List<String> api_product_list_json) {
		this.api_product_list_json = api_product_list_json;
	}
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public String getDeveloper_email() {
		return developer_email;
	}
	public void setDeveloper_email(String developer_email) {
		this.developer_email = developer_email;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getIssued_at() {
		return issued_at;
	}
	public void setIssued_at(String issued_at) {
		this.issued_at = issued_at;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getApplication_name() {
		return application_name;
	}
	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getRefresh_count() {
		return refresh_count;
	}
	public void setRefresh_count(String refresh_count) {
		this.refresh_count = refresh_count;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ApigeeTokenResDTO [refresh_token_expires_in=" + refresh_token_expires_in + ", api_product_list="
				+ api_product_list + ", api_product_list_json=" + api_product_list_json + ", organization_name="
				+ organization_name + ", developer_email=" + developer_email + ", token_type=" + token_type
				+ ", issued_at=" + issued_at + ", client_id=" + client_id + ", access_token=" + access_token
				+ ", application_name=" + application_name + ", scope=" + scope + ", expires_in=" + expires_in
				+ ", refresh_count=" + refresh_count + ", status=" + status + "]";
	}
    

}

