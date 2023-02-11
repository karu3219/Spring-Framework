package com.maven.springframework.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
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
		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("inside afterPropertiesSet method");
			
		}
		@Override
		public void destroy() throws Exception {
			System.out.println("inside destroy method");
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
}
