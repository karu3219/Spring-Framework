package com.maven.springframework.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/Assignment1/shopping.xml");
		ShoppingCart shop = context.getBean("cart",ShoppingCart.class);
		System.out.println(shop);
	}
}
