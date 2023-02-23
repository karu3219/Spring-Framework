package com.maven.SpringFramework.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class Test 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/SpringFramework/SpringJDBC/config.xml");
		JdbcTemplate temp = context.getBean("jdbctemplate",JdbcTemplate.class);
		String insert = "delete Employee where id is 26";
		int result = temp.update(insert);
		System.out.println("number of records inserted are "+result);
	}
}