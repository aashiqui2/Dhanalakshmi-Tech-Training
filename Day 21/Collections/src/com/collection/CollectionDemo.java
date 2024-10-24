package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {
		Laptop dell = new Laptop("Inspiron", 50000, 6, false);
		Laptop lenova = new Laptop("Ideapad", 50000, 8, false);
		Laptop hp = new Laptop("Pavilion", 55000, 10, true);
		
		
		ArrayList LaptopList=new ArrayList(); 
		LaptopList.add(dell);
		LaptopList.add(lenova);
		LaptopList.add(hp);

		ComparatorDemo comp=new ComparatorDemo();
		Collections.sort(LaptopList,comp);
		System.out.println(LaptopList);
		
		
	}

}
