package com.maven.springframework.Assignment1;

public class ShoppingCart {
	private String sh_name;
	public String getSh_name() {
		return sh_name;
	}
	public void setSh_name(String sh_name) {
		this.sh_name = sh_name;
	}
	private Item item;
	public void setItem(Item item)
	{
		this.item=item;
	}
	public Item getItem()
	{
		return item;
	}
	@Override
	public String toString() {
		return "ShoppingCart [sh_name=" + sh_name + ", item=" + item + "]";
	}
	
	
}
