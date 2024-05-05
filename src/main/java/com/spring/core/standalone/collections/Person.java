package com.spring.core.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> universityFriends;
	private Map<String, Integer> inrolledCourses;
	private Properties properties;

	public List<String> getUniversityFriends() {
		return universityFriends;
	}



	public void setUniversityFriends(List<String> universityFriends) {
		this.universityFriends = universityFriends;
	}



	public Map<String, Integer> getInrolledCourses() {
		return inrolledCourses;
	}



	public void setInrolledCourses(Map<String, Integer> inrolledCourses) {
		this.inrolledCourses = inrolledCourses;
	}



	public Properties getProperties() {
		return properties;
	}



	public void setProperties(Properties properties) {
		this.properties = properties;
	}



	@Override
	public String toString() {
		return "Person [\n\tuniversityFriends=" + universityFriends + "\n\tinrolledCourses=" + inrolledCourses
				+ "\n\tproperties=" + properties + "\n]";
	}
	
}
