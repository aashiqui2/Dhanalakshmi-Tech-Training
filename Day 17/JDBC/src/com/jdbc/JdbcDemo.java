package com.jdbc;
import java.sql.*;
public class JdbcDemo {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/crud";
		String uname="root";
		String pass="";
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String query="select * from studentdetails";
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("Name");
		System.out.println(name);
		String email=rs.getString("Email");
		System.out.println(email);
		String queryUpdate="UPDATE `studentdetails` SET `Name` = 'Rahul' WHERE `studentdetails`.`Sno` = 1;";
		st.executeUpdate(queryUpdate);
		name=rs.getString("Name");
		System.out.println(name);
	}
}
