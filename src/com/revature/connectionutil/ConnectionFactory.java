package com.revature.connectionutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.dto.User;

public class ConnectionFactory {
	private static ConnectionFactory cf = null;

	private ConnectionFactory() {
	}

	public static synchronized ConnectionFactory getInstance() {
		if (cf == null)
			cf = new ConnectionFactory();
		return cf;
	}

	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://mydbinstancedb.c0nh2nnc5k1b.us-east-2.rds.amazonaws.com:3306/?useSSL=false";
		String username = "amrsaad14";
		String password="Buick1973";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//
		User user = new User();
		String sql = "select * from ERS_USERS where ERS_USERNAME = ?";
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "amro");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user.setUserId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setFirstName(rs.getString(4));
				user.setLastName(rs.getString(5));
				user.setEmail(rs.getString(6));
				user.setUserRole(rs.getInt(7));
			}
			System.out.println(user);
			
		}catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		//
		return conn;
	}
}
