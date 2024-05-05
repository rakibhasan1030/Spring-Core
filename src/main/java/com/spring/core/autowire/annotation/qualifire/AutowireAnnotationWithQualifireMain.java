package com.spring.core.autowire.annotation.qualifire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationWithQualifireMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/core/autowire/annotation/qualifire/auto-annotation-qualifire-config.xml");
		Employee employeeInfo = context.getBean("employee", Employee.class);
		System.out.println(employeeInfo);
	}
}
