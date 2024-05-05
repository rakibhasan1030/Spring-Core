package com.spring.core.reference;

public class Battary {
	private String model;
	private String capacity;
	public Battary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Battary(String model, String capacity) {
		super();
		this.model = model;
		this.capacity = capacity;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Battary [model=" + model + ", capacity=" + capacity + "]";
	}
}
