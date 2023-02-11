package com.maven.springframework.Collections.setinjuction;
import java.util.Set;
public class Courses {
	private int sem;
	private Set<String> subjects;
	public void setSem(int sem)
	{
		this.sem = sem;
	}
	public int getSem()
	{
		return sem;
	}
	public void setSubjects(Set<String> subjects)
	{
		this.subjects=subjects;
	}
	public Set<String> getSubjects()
	{
		return subjects;
	}

}
