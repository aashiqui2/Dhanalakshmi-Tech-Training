package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArayListDemo2 {
	public static void main(String[] args) {
       List l=new ArrayList();
       l.add('a');
       l.add('b');
//       l.add('c');
       l.add('d');
       l.add('e');
       System.out.println(l);
       Collections.reverse(l);
       System.out.println(l);
//       Collections.binarySearch(List, key);
       // Collections.binarySearch(List, Key, c);
       System.out.println(Collections.binarySearch(l, 'c'));
//       System.out.println(Collections.binarySearch(l, 'f'));
	}

}
