package com.maven.springframework.dependencycheck.innerbean;

public class Marks
{
	private double cgpa;
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	@Override
	public String toString() {
		return "Marks [cgpa=" + cgpa + "]";
	}
	
}
