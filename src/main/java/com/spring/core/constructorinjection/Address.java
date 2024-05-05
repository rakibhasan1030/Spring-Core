package com.spring.core.constructorinjection;

public class Address {
	private String village;
	private String district;
	private int postcode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String village, String district, int postcode) {
		super();
		this.village = village;
		this.district = district;
		this.postcode = postcode;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", district=" + district + ", postcode=" + postcode + "]";
	}
}
