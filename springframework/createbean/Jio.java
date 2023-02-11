package com.maven.springframework.createbean;

public class Jio implements Sim{
	private int ph_no;
	private String user_name;
	public int getPh_no()
	{
		return ph_no;
	}
	public String getUser_name()
	{
		return user_name;
	}
	public void setPh_no(int ph_no)
	{
		this.ph_no=ph_no;
	}
	public void setUser_name(String user_name)
	{
		this.user_name=user_name;
	}
	public void calling()
	{
		System.out.println("calling from Jio");
	}
	public void browsing()
	{
		System.out.println("browsing from Jio");
	}
}