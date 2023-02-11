package com.maven.springframework.createbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/createbean/bean.xml");
		Airtel air=(Airtel)context.getBean("airtel");
		air.calling();
		air.browsing();
		System.out.println(air);
	}

}
