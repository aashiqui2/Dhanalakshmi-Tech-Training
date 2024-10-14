package tamilnadu.trichy;

import tamilnadu.chennai.Office;

public class Branch_Office extends Office{

	public static void main(String[] args) {
		Branch_Office bo=new Branch_Office();
		bo.work();
		bo.celebrate_local_function();
	}
	public void celebrate_local_function()
	{
		System.out.println("celebrating ");
	}

}
