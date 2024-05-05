package com.spring.core.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StandaloneCollectionsMain {
	public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/core/standalone/collections/standalone-collections-config.xml");
    	Person personInfo = (Person) context.getBean("personOne");
		System.out.println(personInfo);
		System.out.println("\n\n--- Friends List(" + personInfo.getUniversityFriends().getClass().getName() + ")" + " : " + personInfo.getUniversityFriends());
		System.out.println("--- Inrolled Courses(" + personInfo.getInrolledCourses().getClass().getName() + ")" + " : " + personInfo.getInrolledCourses());
		System.out.println("--- Properties(" + personInfo.getProperties().getClass().getName() + ")" + " : " + personInfo.getProperties());
	}
}
