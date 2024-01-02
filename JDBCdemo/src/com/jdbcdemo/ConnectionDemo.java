package com.jdbcdemo;
import java.sql.*;
public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		//define variables
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="0275";
		
		
		//load driver
		Class.forName(driver);
		//establish connection
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connection successful");
	}

}