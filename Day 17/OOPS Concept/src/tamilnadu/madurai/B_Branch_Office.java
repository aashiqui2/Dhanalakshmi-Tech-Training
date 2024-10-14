package tamilnadu.madurai;

import tamilnadu.trichy.Branch_Office;

public class B_Branch_Office extends Branch_Office{
	public B_Branch_Office()
	{
		System.out.println("i am from B_Branch_Office");
	}

	public static void main(String[] args) {
		B_Branch_Office bbo=new B_Branch_Office();
		bbo.celebrate_local_function();
		bbo.wfh();
	}

}
