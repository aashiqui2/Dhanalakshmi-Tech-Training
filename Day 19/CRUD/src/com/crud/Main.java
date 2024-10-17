package com.crud;
import java.sql.*;
import java.util.Scanner;
import static java.lang.System.exit;


public class Main {

    public static void createData(){
        final String url = "jdbc:mysql://localhost:3306/employeedb";
        final String uname = "root";
        final String pass = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t*Please Remember 'Your ID' number for further Updatation.....");
        System.out.print("\t\t\tEnter employee ID number : ");
        int id = sc.nextInt();
        System.out.print("\t\t\tEnter employee name : ");
        String name = sc.next();
        System.out.print("\t\t\tEnter employee department : ");
        String department = sc.next();
        System.out.print("\t\t\tEnter employee Location : ");
        String location = sc.next();


        String query="INSERT INTO employees (id, name, department, location) values ('"+id+"','"+name+"','"+department+"','"+location+"')";
        Connection con;

        try{
            con=DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            int rows = st.executeUpdate(query);
            if(rows==1) {
                System.out.println("\t\t\t rows affected....");
            }else {
                System.out.println("\t\t\tSomething is Wrong.....!! ");
            }
            menu();


        }catch (Exception e){
            e.printStackTrace();

        }

    }
    public static void readData(){
        final String url = "jdbc:mysql://localhost:3306/employeedb";
        final String uname = "root";
        final String pass = "";
        String query = "select * from employees";

        Connection con;
        try {
            con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                String location = rs.getString("location");

                System.out.println("\t\t\tEmp ID : "+id+"  Name -->> "+name+"    Department -->> "+department+"    Location -->> "+location);
            }
            menu();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void deleteData(){
        final String url ="jdbc:mysql://localhost:3306/employeedb";
        final String uname = "root";
        final String pass = "";
        System.out.print("\t\t\tEnter Employee ID number : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String query = "DELETE  FROM employees where id ='"+id+"' ";

        Connection con;
        try{
            con = DriverManager.getConnection(url,uname,pass);
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(query);
            if(rows==1) {
                System.out.println("\t\t\t rows affected....");
            }else {
                System.out.println("\t\t\tPlease enter correct ID number.....!! ");
                deleteData();
            }
            menu();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void updateData(){
        final String url ="jdbc:mysql://localhost:3306/employeedb";
        final String uname = "root";
        final String pass = "";
        String query = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t1 - ID no. Updates");
        System.out.println("\t\t\t2 - Name Updates");
        System.out.println("\t\t\t3 - Location Updates");
        System.out.println("\t\t\t4 - Department Updates");
        System.out.print("\t\t Choose Option to Updates data -->> ");
        int opt = sc.nextInt();
        if(opt==1){
            System.out.print("\n\t\t\tEnter name of Employee : ");
            String name = sc.next();
            System.out.print("\t\t\tEnter to updates ID number : ");
            int id = sc.nextInt();
            query = "UPDATE employees SET id ='"+id+"' where name ='"+name+"' ";
        }else if(opt==2){
            System.out.print("\n\t\t\tEnter employee ID number : ");
            int id = sc.nextInt();
            System.out.print("\t\t\tEnter Names to Updates  : ");
            String name = sc.next();
            query = "UPDATE employees SET name ='"+name+"' where id ='"+id+"' ";
        }
        else if(opt==3){
            System.out.print("\n\t\t\tEnter employee ID number : ");
            int id = sc.nextInt();
            System.out.print("\t\t\tEnter Location to updates  : ");
            String location = sc.next();
            query = "UPDATE employees SET location ='"+location+"' where id ='"+id+"' ";

        }
        else if(opt==4){
            System.out.print("\n\t\t\tEnter employee ID number : ");
            int id = sc.nextInt();
            System.out.print("\t\t\tEnter Department Names to Updates  : ");
            String department = sc.next();
            query = "UPDATE employees SET department ='"+department+"' where id ='"+id+"' ";
        }
        else {
            System.out.println("\n\t\t\tChoose correct option ......");
            updateData();
        }
        Connection con;
        try{
            con = DriverManager.getConnection(url,uname,pass);
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(query);
            if(rows==1) {
                System.out.println("\t\t\t\t\t rows affected....");
            }else {
                System.out.println("\t\t\tPlease enter correct data .....!! ");
                updateData();
            }
            menu();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void menu() {
        System.out.println("\n\n\t\t\t --------- CRUD OPERATION USING JAVA --------\n");
        System.out.println("\t\t\t1 - Create Data ");
        System.out.println("\t\t\t2 - Read Data ");
        System.out.println("\t\t\t3 - Update Data ");
        System.out.println("\t\t\t4 - Delete Data ");
        System.out.println("\t\t\t5 - Exit");
        System.out.print("\t\t Select Option  ---->>>  ");
        Scanner sc = new Scanner(System.in);
        int select= sc.nextInt();
        switch (select) {
            case 1 -> {
                System.out.println("\n\n\t\t\t ------ Create Employee Data Carefully ------\n");
                createData();
            }
            case 2-> {
                System.out.println("\n\n\t\t\t\t\t ---------- Employees Data ---------\n");
                readData();

            }
            case 3 -> {
                System.out.println("\n\n\t\t\t\t\t --------- Updates Employee Data ---------\n");
                updateData();
            }
            case 4 -> {
                System.out.println("\n\n\t\t\t\t\t ---------- Delete Employee Data ----------\n");
                deleteData();
            }
            case 5 -> {
                System.out.println("\t\t\t\t\t   Exiting....\n \t\t\t\t\t Thank You...♥");
                exit(0);
            }
            default -> {
                System.out.println("Wrong Option...!");
                menu();
            }
        }


    }
    public static void main(String[] args) {
        menu();

    }
}