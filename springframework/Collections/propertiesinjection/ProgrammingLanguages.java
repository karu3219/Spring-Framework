package com.maven.springframework.Collections.propertiesinjection;

import java.util.Properties;
public class ProgrammingLanguages
{
	private int id;
	private Properties languages;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setLanguages(Properties languages)
	{
		this.languages=languages;
	}
	public Properties getLanguages()
	{
		return languages;
	}
	
}
