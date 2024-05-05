package com.spring.core.spel.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Organization {

	// invoke basic value
	@Value("Datasoft")
	private String name;

	// invoke expression with SPEL
	@Value("#{25+25+25}")
	private int code;

	/*
	 * invoke static method using SPEL Expression Convention : #{ T(class).method(parameter) }
	 */
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private int annualIncome;

	/*
	 * invoke static variable using SPEL Expression Convention : #{ T(class).variableName }
	 */
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;

	/*
	 * invoke object using SPEL Expression Convention : #{ new AnyClassName("YourValue") }
	 */
	@Value("#{ new java.lang.String('Dhaka, Bangladesh') }")
	private String address;

	/*
	 * invoke object using SPEL Expression Convention : #{ new AnyClassName("YourValue") }
	 */
	@Value("#{ new com.spring.core.spel.basic.DatasoftManufacture('Datasoft Manufacturer Company Limited') }")
	private DatasoftManufacture sisterConcern;
	
	
	/*
	 * invoke boolean using SPEL Expression Convention : #{ expression thats return true/false }
	 */
	@Value("#{ (100-85) > 10 }")
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DatasoftManufacture getSisterConcern() {
		return sisterConcern;
	}

	public void setSisterConcern(DatasoftManufacture sisterConcern) {
		this.sisterConcern = sisterConcern;
	}
	
	

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Organization [name=" + name + ", code=" + code + ", annualIncome=" + annualIncome + ", pi=" + pi
				+ ", address=" + address + ", sisterConcern=" + sisterConcern + ", isActive=" + isActive + "]";
	}

}

































