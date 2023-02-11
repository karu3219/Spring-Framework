package com.maven.springframework.dependencycheck.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/dependencycheck/innerbean/config.xml");
		Student std = context.getBean("std",Student.class);
		System.out.println(std);
	}
}
