package com.filehandling;

import java.io.File;

public class FileHandlingDemo3 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Aashiq\\Documents\\DS TECH\\Day 17\\FileHandling\\src\\Test");
		String a[] = file.list();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
