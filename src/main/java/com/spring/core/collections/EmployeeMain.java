package com.spring.core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/spring/core/collections/collections-config.xml");
		Employee employeeOne = (Employee) context.getBean("employeeOne");
		Employee employeeTwo = (Employee) context.getBean("employeeTwo");
		System.out.println(employeeOne);
		System.out.println(employeeTwo);
	}
}
