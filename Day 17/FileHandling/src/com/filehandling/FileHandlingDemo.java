package com.filehandling;

import java.io.File;

public class FileHandlingDemo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Aashiq\\Documents\\DS TECH\\Day 17\\FileHandling\\src\\TEST\\ee");
		boolean present = file.exists();
		System.out.println("the folder present " + present);
		if(present==false)
		{
			file.mkdirs();
		}
		else {
			System.out.println("folder already created");
		}

	}

}
