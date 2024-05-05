package com.spring.core.autowire;


public class Employee {
	private Company company;

	public Employee() {
		super();
	}

	public Employee(Company company) {
		super();
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + "]";
	}
}
