package com.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.javaconfig")
public class JavaConfig {

	@Bean
	public Book getBook() {
		return new Book();
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getBook());
		return student;
	}
}
