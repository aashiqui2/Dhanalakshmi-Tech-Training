package com.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		try {
		sum(arr);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("index exceeded");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		

	}
	public static void sum(int a[])throws ArrayIndexOutOfBoundsException {
		int sum=0;
		for(int i=0;i<10;i++){
			sum+=a[i];
		}
	}

}
