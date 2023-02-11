package com.maven.springframework.referancetypes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class RefTest {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/referancetypes/reftypinj.xml");
		KannadaHitFilms films = (KannadaHitFilms)context.getBean("kanHfilms");
		System.out.println(films);
	}

}
