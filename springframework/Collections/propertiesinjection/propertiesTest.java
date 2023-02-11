package com.maven.springframework.Collections.propertiesinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propertiesTest 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/Collections/propertiesinjection/propinj.xml");
		ProgrammingLanguages lang = context.getBean("prog",ProgrammingLanguages.class);
		System.out.println(lang.getId());
		System.out.println(lang.getLanguages().getClass());
		
	}
}
