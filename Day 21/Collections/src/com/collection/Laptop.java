package com.collection;

public class Laptop {
	int price;
	int gb;
	boolean touch;
	String brand;
	
	public Laptop(String brand,int price,int gb,boolean touch)
	{
		this.brand=brand;
		this.price=price;
		this.gb=gb;
		this.touch=touch;
	}
	 public String toString()
	 {
		return this.brand+" "+this.price+" "+this.touch+" "+this.gb;
		 
	 }

}
