package com.maven.springframework.dependencycheck.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/dependencycheck/Assignment/Assconfig.xml");
		University university1 = context.getBean("uni",University.class);
		System.out.println(university1.hashCode());
		University university2 = context.getBean("uni",University.class);
		System.out.println(university2.hashCode());
	}
}
