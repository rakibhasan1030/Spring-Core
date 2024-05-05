package com.spring.core.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/autowire/annotation/auto-annotation-config.xml");
		Employee employeeInfo = context.getBean("employee", Employee.class);
		System.out.println(employeeInfo);
	}
}
