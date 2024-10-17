package com.Collection;

import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		if(s1.length()>s2.length())
		{
			return -1;
		}
		else if(s2.length()>s1.length())
		{
			return +1;
		}
	
		return 0;
	}

}
