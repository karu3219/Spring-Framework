package com.maven.springframework.dependencycheck.sample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/dependencycheck/config.xml");
		CS people = context.getBean("sec",CS.class);
		System.out.println(people);
	}
}
