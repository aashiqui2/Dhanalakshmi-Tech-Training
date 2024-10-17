package com.Collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

	public static void main(String[] args) {
//	    int a[]= {10,20,30};
//	    int b[]= {10,20,30};
//	    int b[]=a;
//	    if(a==b)
//	    {
//	    	System.out.println("both are same");
//	    }
//	    else {
//	    	System.out.println("not same");
//	    }
//	    System.out.println(Arrays.equals(a,b));

//	    int i=0;
//	    boolean same=true;
//	    while(i<a.length)
//	    {
//	    	if(a[i]!=b[i])
//	    	{
//	    		same=false;
//	    	}
//	    	i++;
//	    }
//	    if(same ==true) {
//	    	System.out.println("both array are same");
//	    }
//	    else {
//	    	System.err.println("not same");
//	    }

//	    int a[]= {20,10,50,40,30};
//	    Arrays.sort(a);
//	    for(int value:a)
//	    {
//	    	System.out.print(value+" ");
//	    }

//	    wrapper clase
//	    Integer-->int
//	    Float->float
//	    Double->double
//	    Character->char
//	    Boolean ->boolean

//		Integer arr[] = { 20, 10, 50, 40, 30 };
//
//		Comparator<Integer> comp = new Comparator<>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//
//				return o2.compareTo(o1);
//			}
//		};
//
//		Arrays.sort(arr, comp);
//		for (int value : arr) {
//			System.out.print(value + " ");
//		}
		
//		
//		String[] names={"vishaal","suriyakanth","arun","gopal"};
//		Arrays.sort(names);
//		for(String name:names)
//		{
//			System.out.print(name+" ");
//		}
		String[] names={"vishaal","suriyakanth","arun","gopal"};
		Comparator comp=new ComparatorDemo();
		Arrays.sort(names,comp);
		for(String name:names) {
			System.out.print(name+" ");
		}

	}

}
