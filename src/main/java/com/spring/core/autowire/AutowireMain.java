package com.spring.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/core/autowire/auto-config.xml");
		Employee employeeInfo = context.getBean("employee", Employee.class);
		System.out.println(employeeInfo);
	}
}
