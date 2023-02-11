package com.maven.springframework.Collections.setinjuction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/Collections/setinjuction/setinj.xml");
		Courses cour=context.getBean("cource",Courses.class);
		System.out.println(cour.getSem());
		System.out.println(cour.getSubjects().getClass());
	}

}
