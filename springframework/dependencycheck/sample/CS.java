package com.maven.springframework.dependencycheck.sample;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class CS 
{
	private char section;
	private List<String> students;
	
	@Required
	public void setSection(char section)
	{
		this.section=section;
	}
	public char getSection()
	{
		return section;
	}
	@Required
	public void setStudents(List<String> students)
	{
		this.students=students;
	}
	public List<String> getStudents()
	{
		return students;
	}
	@Override
	public String toString() {
		return "CS [section=" + section + ", students=" + students + "]";
	}
//	RequiredAnnotationBeanPostProcessor a;
	
}
