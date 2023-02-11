package com.maven.springframework.dependencycheck.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/dependencycheck/scope/config.xml");
		Human hm1 = context.getBean("hmn", Human.class);
		System.out.println(hm1.hashCode());
		Human hm2 = context.getBean("hmn", Human.class);
		System.out.println(hm2.hashCode());
	}
}
