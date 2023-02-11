package com.maven.springframework.Assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	private int id;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	@PostConstruct
	public void initialize()
	{
		System.out.println("inside initialize method");
	}
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("inside cleanUp method");
	}
	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}
	
}
