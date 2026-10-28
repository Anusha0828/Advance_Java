package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String URL = "jdbc:mysql://localhost:3306/advJava?user=root&password=Anusha@556";
		String query="Select * from student";
		try {
			Connection connection=DriverManager.getConnection(URL);
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(query);
			System.out.println("ID \t Name \t Age \t Marks");
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				int marks=rs.getInt(4);
				System.out.println(id+"\t"+name+"\t"+age+"\t"+marks);
			}
			connection.close();
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}


	}

}
