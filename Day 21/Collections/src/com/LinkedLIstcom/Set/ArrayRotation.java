package com.LinkedLIstcom.Set;

import java.util.ArrayList;

public class ArrayRotation {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		// 10 20 30 40 50
		// 50 10 20 30 40

		for (int i = 0; i < 1; i++) {
			Integer a = (Integer)l.get(l.size()-1);
			System.out.println(a);
			for (int j = l.size() - 1; j > 0; j--) {
				l.set(j, l.get(j - 1));
			}
			l.set(0, a);
		}
		System.out.println(l);
	}
}
