package com.spring.core.reference;

public class Mobile {
	private String name;
	private Battary battaryInfo;
	public Mobile() {
		super();
	}
	public Mobile(String name, Battary battaryInfo) {
		super();
		this.name = name;
		this.battaryInfo = battaryInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Battary getBattaryInfo() {
		return battaryInfo;
	}
	public void setBattaryInfo(Battary battaryInfo) {
		this.battaryInfo = battaryInfo;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", battaryInfo=" + battaryInfo + "]";
	}
}
