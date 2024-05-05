package com.spring.core.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("Rakib Hasan") 
	private String studentName;
	
	@Value("Dhaka, Bangladesh") 
	private String studentCity;
	
	@Value("#{friendsName}")
	private List<String> friendsName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public List<String> getFriendsName() {
		return friendsName;
	}

	public void setFriendsName(List<String> friendsName) {
		this.friendsName = friendsName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", friendsName=" + friendsName
				+ "]";
	}
}
