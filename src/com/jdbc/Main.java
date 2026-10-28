package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String URL = "jdbc:mysql://localhost:3306/advJava?user=root&password=Anusha@556";
		String query="insert into student values(2,'NihaSri',8,100)";
//		String query="delete from student where id=2";
		try {
			Connection connection=DriverManager.getConnection(URL);
			Statement st=connection.createStatement();
			int qy=st.executeUpdate(query);
			System.out.println(qy+" inserted");
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
