package tamilnadu.trichy;

import tamilnadu.chennai.Office;

public class Branch_Office extends Office{
	public Branch_Office()
	{
		System.out.println("i am from Branch_Office");
	}

	public static void main(String[] args) {
		Branch_Office bo=new Branch_Office();
		bo.work();

	}
	public void celebrate_local_function()
	{
		System.out.println("celebrating local Function");
	}

}
