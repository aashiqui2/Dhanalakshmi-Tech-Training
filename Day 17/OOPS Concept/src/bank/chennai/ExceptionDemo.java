package bank.chennai;

import java.util.Scanner;
public class ExceptionDemo {
	public static void main(String[] args) {
		divide();
	}
	public static void divide()
	{
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		try {
			System.out.println(no1/no2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("check second no");
			divide();
		}
		try {
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int a[]=new int[size];
			for(int i=0;i<10;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(NegativeArraySizeException  | ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("check the array size");	
		}
	}

}
