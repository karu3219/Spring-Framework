package com.maven.springframework.Collections.mapinjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.
public class MapInjTest 
{
		public static void main(String args[])
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/springframework/Collections/mapinjuction/mapinj.xml");
			Department_Cnt depCnt =(Department_Cnt)context.getBean("depr_cnt");
			System.out.println(depCnt);
//			System.out.println(depCnt.getDepartmentCount());
			System.out.println(depCnt.getDepartmentCount().getClass());
		}
}
