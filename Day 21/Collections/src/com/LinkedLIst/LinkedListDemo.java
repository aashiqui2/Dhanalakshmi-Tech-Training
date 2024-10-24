package com.LinkedLIst;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList: 1) Data Retrival is faster(Advantage) 2) Insertion and deletion of
		 * elements at first and middle position need more shift
		 * operation.(Disadvantage)
		 * 
		 * LinkedList: 1) Element Insertion/Deletion is faster. 2) Element retrival is
		 * not faster.
		 */

		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(true);
		ll.add(null);
		ll.add('c');
		ll.add("string");
		System.out.println(ll.contains(20));
		System.out.println(ll);
		
		System.out.println(ll.poll());//remove first
		System.out.println(ll);
		
		System.out.println(ll.pollLast());//remove last
		System.out.println(ll);
		
		System.out.println(ll.offer(30));//add last
		System.out.println(ll);
		
		System.out.println(ll.offerFirst("ashok"));
		//adds first
		System.out.println(ll);
	}
}
