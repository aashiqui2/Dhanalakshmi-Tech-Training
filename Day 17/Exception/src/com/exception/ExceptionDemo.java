package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		divide();

	}

	public static void divide() {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a / b);
			System.out.println("enter the size");
			int size = sc.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArithmeticException ae) {
			System.out.println("check second no");
		} catch (InputMismatchException im) {
			System.out.println("give only number");
		} catch (NegativeArraySizeException ne) {
			System.out.println("enter valid size for array");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("exceed the array size");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		finally {
			System.out.println("hi");			
		}
	}
}
