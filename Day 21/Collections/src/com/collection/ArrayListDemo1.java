package com.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(1);//0
		l.add(2.1);//1
		l.add(true);//2
		l.add("arun");//3
		l.add('s');//4
		l.add("arun");//5
		
		System.out.println(l);
		
		ArrayList l1=new ArrayList();
		
		l1.add("ram");
		l1.add("kumar");
		l1.add("gopal");
		l1.add("bholu");
		
		ArrayList l2=new ArrayList();
		for(int i=0;i<l1.size();i++)
		{
			l2.add(l.get(i));
			l2.add(l1.get(i));
		}
		for(int i=l1.size();i<l.size();i++)
		{
			l2.add(l.get(i));
		}
		System.out.println(l2);
		l2.retainAll(l);
		System.out.println(l2);
		
		
		
		

	}

}
