package com.maven.springframework.lc.annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
	public static void main(String args[])
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/lc/annotations/config.xml");
		Student st =(Student) context.getBean("std");
		System.out.println(st);
		context.registerShutdownHook();
	}
}
