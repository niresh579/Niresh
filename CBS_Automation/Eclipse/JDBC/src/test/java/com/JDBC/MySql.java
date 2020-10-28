package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MySql {
	
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Connect to DB
			con = DriverManager.getConnection("jdbc:mysql://192.168.30.140/localhost:8080/Stage", "devuser", "readonly4stg");
			
			//Query
			String sql = "Select * from memberinfo where matriid='AGR754715'";
			PreparedStatement p = con.prepareStatement(sql);
			
			//Execute
			ResultSet rs = p.executeQuery();
			
			//iterate
			while (rs.next()) {
				String ID = rs.getString(0);
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		       
			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
		}
		
		
	}

}
