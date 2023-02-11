package com.maven.springframework.Collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inject_ListElements 
{
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/Collections/config.xml");
		Friends frds=context.getBean("dhost", Friends.class);
		System.out.println(frds.getName());
		System.out.println(frds.getFrds());
	}
}
