package com.spring.core.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReferenceMain {
	public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/core/reference/reference-config.xml");
    	Mobile mobileInfo = (Mobile) context.getBean("mobileRef");
		System.out.println(mobileInfo);
	}
}
