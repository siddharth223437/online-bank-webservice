package com.sb.micro.login.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class AddressVO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	private String city,country,state;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private UsersVO userVO;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public UsersVO getUserVO() {
		return userVO;
	}

	public void setUserVO(UsersVO userVO) {
		this.userVO = userVO;
	}
}
