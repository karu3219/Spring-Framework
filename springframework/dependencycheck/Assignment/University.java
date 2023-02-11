package com.maven.springframework.dependencycheck.Assignment;

import org.springframework.beans.factory.annotation.Required;
//import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

public class University 
{
	private int id;
	private String name;
	private String location;
	
	@Required
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
//	CommonAnnotationBeanPostProcessor a;
}
