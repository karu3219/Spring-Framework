package com.maven.springframework.Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[])
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/Assignment2/config.xml");
		TicketReservation ticket = (TicketReservation)context.getBean("ticket");
		System.out.println(ticket);
		context.registerShutdownHook();
	}
}
