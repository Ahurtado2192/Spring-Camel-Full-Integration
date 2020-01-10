package org.springboot.camel.ex421.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	@JsonProperty
	private Integer userId;
	@JsonProperty
	private String userName;
	@JsonProperty
	private String useraddress;
	@JsonProperty
	private String zipCode;
	@JsonProperty
	private Integer idOrder;
	@JsonIgnore
	private List<Orders> userOrders;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Integer getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}
	public List<Orders> getUserOrders() {
		return userOrders;
	}
	public void setUserOrders(List<Orders> userOrders) {
		this.userOrders = userOrders;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	

}
