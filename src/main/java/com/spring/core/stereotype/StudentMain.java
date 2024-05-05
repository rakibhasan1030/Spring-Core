package com.spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/spring/core/stereotype/stereotype-config.xml");
		Student studentInfo = context.getBean("student", Student.class);
		System.out.println(studentInfo);
		
		
		/* 
		 * Bean Scope always provide Singleton object.
		 * No matter how many times you get object from bean scope,
		 * it'll give you same reference of that object which follows
		 * the singleton scope. Example bellow...
		 */
		Student studentInfoOne = context.getBean("student", Student.class);
		System.out.println("HASHCODE of studentInfoOne = " + studentInfoOne.hashCode());
		Student studentInfoTwo = context.getBean("student", Student.class);
		System.out.println("HASHCODE of studentInfoTwo = " + studentInfoTwo.hashCode());
		
	}
}
