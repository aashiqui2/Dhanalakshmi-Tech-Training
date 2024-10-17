package com.crud;
import java.sql.*;
import java.util.Scanner;

public class Main {
	/*
	    final String url = "jdbc:mysql://localhost:3306/crud";
        final String uname = "root";
        final String pass = "";
	 */

	public static void main(String[] args) {
		menu();
		
	}
	
	
	public static void Create()
	{
		final String url = "jdbc:mysql://localhost:3306/crud";
        final String uname = "root";
        final String pass = "";
        
        Connection con;
        try {
        	con=DriverManager.getConnection(url,uname,pass);
        	Statement st=con.createStatement();
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the Name: ");
        	String name=sc.nextLine();
        	System.out.println("Enter the Email: ");
        	String email=sc.nextLine();
        	System.out.println("Enter the Mobile: ");
        	String mobile=sc.nextLine();
        	
        	String Query="INSERT INTO `studentdetails` (`name`, `email`, `mobile`) VALUES ('"+name+"', '"+email+"', '"+mobile+"');";
        	int row=st.executeUpdate(Query);
        	if(row==1)
        	{
        		System.out.println("rows afftected");
        	}
        	else {
        		System.out.println("something wrong");
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        menu();
	}
	
	
	public static void Read() {
		final String url = "jdbc:mysql://localhost:3306/crud";
        final String uname = "root";
        final String pass = "";
        Connection con;
        try {
        	con=DriverManager.getConnection(url,uname,pass);
        	Statement st=con.createStatement();
        	String Query="select * from studentdetails";
        	ResultSet rs=st.executeQuery(Query);
        	rs.next();
        	while(rs.next()) {
        		String name=rs.getString("name");
        		System.out.println("Name:"+name);
        		String email=rs.getString("email");
        		System.out.println("Email:"+email);
        		String mobile=rs.getString("mobile");
        		System.out.println("Mobile:"+mobile);
        	}
        	menu();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		
	}
	public static void Delete()
	{
		final String url = "jdbc:mysql://localhost:3306/crud";
        final String uname = "root";
        final String pass = "";
        Connection con;
        try {
        	con=DriverManager.getConnection(url,uname,pass);
        	Statement st=con.createStatement();
        	Scanner sc=new Scanner(System.in);
        	String name=sc.nextLine();
        	String Query="DELETE FROM studentdetails WHERE `studentdetails`.`name` = '"+name+"';";
        	int row=st.executeUpdate(Query);
        	if(row==1)
        	{
        		System.out.println("successfully deleted");
        	}
        	else {
        		System.out.println("something wrong");
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	
	
	public static void menu() {
		System.out.println("CRUD OPERATION");
		System.out.println("1.Create ");
		System.out.println("2.Read");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("5.Exit");
		System.out.println("Enter the choice");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch (choice)
		{
		case 1: Create();
		        menu();
		        break;
		case 2: Read();
		        menu();
		        break;
		case 3: //Update();
		        menu();
		        break;
		case 4: Delete();
		        menu();
		        break;
		case 5: System.exit(0);
		
		}
	}

}
