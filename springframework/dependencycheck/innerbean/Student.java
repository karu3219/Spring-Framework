package com.maven.springframework.dependencycheck.innerbean;

public class Student 
{
	private int id;
	private String name;
	private Marks score;
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
	public void setScore(Marks score)
	{
		this.score=score;
	}
	public Marks getScore()
	{
		return score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
}
