package com.spring.core.spel.basic;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelBasicMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/spring/core/spel/basic/spel-basic-config.xml");
		Organization organizationInfo = context.getBean("organization", Organization.class);
		System.out.println(organizationInfo);
		
		System.out.println("\t -------------------- \t");
		
		//Spring Expression Language using direct API
		System.out.println("Spring Expression Language using direct API:");
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("(7+5)*12");
		System.out.println(expression.getValue());
		
	}
}
