package com.LinkedLIstcom.Set;

import java.util.ArrayList;

public class PracticeDemo {

	public static void main(String[] args) {
		// 10 20 30 40 50
		// 20 30 40 50 10
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		
		for(int i=0;i<1;i++)
		{
			Integer a=(Integer)l.get(0);
			for(int j=0;j<l.size()-1;j++)
			{
				l.set(j, l.get(j+1));
			}
			l.set(l.size()-1, a);
			
		}
		System.out.println(l);

	}

}
