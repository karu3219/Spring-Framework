package com.maven.springframework.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import javax.annotatio
public class Student
{
		private int id;
		private String name;
		public void setId(int id)
		{
			System.out.println("setting id");
			this.id=id;
		}
		public int getId()
		{
			return id;
		}
		public void setName(String name)
		{
			System.out.println("setting name");
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		@PostConstruct
		public void initMethod()
		{
			System.out.println("inside Init Method");
		}
		@PreDestroy
		public void destroyMethod()
		{
			System.out.println("inside Destroy Method");
		}
		@Override
		public String toString() 
		{
			return "Student [id=" + id + ", name=" + name + "]";
		} 
}
