package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Collection of objects -Heterogenous -Homogeneous
		//1.Resizable Array
		//2.Heterogenous Object are allowded
	    //3.Data Structure:Growable array.
		
		List ar=new ArrayList();
		
		ar.add(1);
		ar.add('c');
		ar.add("ashok");
		ar.add(true);
		ar.add(5.2);
		ArrayListDemo ald=new ArrayListDemo();
		ar.add(ald);
		System.out.println(ar);

	}

}
