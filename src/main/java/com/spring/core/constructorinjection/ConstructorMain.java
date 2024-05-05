package com.spring.core.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConstructorMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/spring/core/constructorinjection/constructor-config.xml");
		Person personInfo = (Person) context.getBean("Person");
		Address addressInfo = (Address) context.getBean("Address");
		System.out.println(personInfo);
		System.out.println(addressInfo);
	}
}
