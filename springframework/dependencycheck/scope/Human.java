package com.maven.springframework.dependencycheck.scope;

public class Human 
{
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + "]";
	}
	
}
