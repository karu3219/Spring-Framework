package com.maven.springframework.createbean;
public class Airtel implements Sim{
	int ph_no;
	String user_name;
	public void setPh_no(int ph_no)
	{
		this.ph_no=ph_no;
	}
	public void setUser_name(String user_name)
	{
		this.user_name=user_name;
	}
	public int getPh_no()
	{
		return ph_no;
	}
	public String getUser_name()
	{
		return user_name;
	}
	@Override
	public String toString() {
		return "Airtel [ph_no=" + ph_no + ", user_name=" + user_name + "]";
	}
	public void calling()
	{
		System.out.println("calling from Airtel");
	}
	public void browsing()
	{
		System.out.println("browsing from Airtel");
	}
}