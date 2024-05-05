package com.spring.core.javaconfig;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	private String name;
	private String className;
	private int rollNumer;
	private Book book;
	
	
	
	public Student(Book book) {
		super();
		this.book = book;
	}

	public void study() {
		System.out.println("The student is reading " + book.getBooknName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getRollNumer() {
		return rollNumer;
	}

	public void setRollNumer(int rollNumer) {
		this.rollNumer = rollNumer;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", className=" + className + ", rollNumer=" + rollNumer + "]";
	}
}
