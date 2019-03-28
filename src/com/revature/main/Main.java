package com.revature.main;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.connectionutil.ConnectionFactory;

public class Main {

	public static void main(String[] args) {
		
		try {
			Connection conn = ConnectionFactory.getInstance().getConnection();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
