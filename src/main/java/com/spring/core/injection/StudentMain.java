package com.spring.core.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/core/injection/student-config.xml");
        Student studentOne =  (Student) context.getBean("studentOne");
        Student studentTwo =  (Student) context.getBean("studentTwo");
    	System.out.println(studentOne);
    	System.out.println(studentTwo);
    }
}
