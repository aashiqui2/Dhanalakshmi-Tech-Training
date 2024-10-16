package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo1 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Aashiq\\Documents\\DS TECH\\Day 17\\FileHandling\\src\\Test\\1.txt");
		file.delete();
		boolean present=file.exists();
		if(present==false)
		{
			file.createNewFile();
			System.out.println("file created successfully");
		}
		else {
			System.out.println("file already created");
		}

	}

}
