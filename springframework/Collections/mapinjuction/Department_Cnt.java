package com.maven.springframework.Collections.mapinjuction;
import java.util.Map;
public class Department_Cnt 
{
	private String university;
	private Map<String,Integer> departmentCount;
	public void setUniversity(String university)
	{
		this.university=university;
	}
	public String getUniversity()
	{
		return university;
	}
	public void setDepartmentCount(Map<String,Integer> departmentCount)
	{
		this.departmentCount=departmentCount;
	}
	public Map<String,Integer> getDepartmentCount()
	{
		return departmentCount;
	}
	@Override
	public String toString() {
		return "Department_Cnt [university=" + university + ", departmentCount=" + departmentCount + "]";
	}
}
