package com.spring.core.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private Set<String> phoneNumbers;
	private List<String> addresses;
	private Map<String, String> courses;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Set<String> phoneNumbers, List<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;
		this.courses = courses;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNumber=" + phoneNumbers + ", addresses=" + addresses + ", courses="
				+ courses + "]";
	}
}
