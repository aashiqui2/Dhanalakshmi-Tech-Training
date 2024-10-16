package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo2 {

	public static void main(String[] args) throws IOException {
	File file =new File("C:\\Users\\Aashiq\\Documents\\DS TECH\\Day 17\\FileHandling\\src\\Test\\2.txt");
	file.createNewFile();
	File file1 =new File("C:\\Users\\Aashiq\\Documents\\DS TECH\\Day 17\\FileHandling\\src\\Test\\3.txt");
	boolean renamed=file.renameTo(file);
	if(renamed==false)
	{
		System.out.println("unsuccessfull");
	}
	else {
		System.out.println("successfully renamed");
	}
	
	

	}

}
