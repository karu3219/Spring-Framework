package com.maven.springframework.Collections;
import java.util.List;
public class Friends {
	private String name;
	private List<String> frds;
	public void setFrds(List<String> frds)
	{
		this.frds=frds;
	}
	public List<String> getFrds()
	{
		return frds;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
}
