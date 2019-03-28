package com.revature.impDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.connectionutil.ConnectionFactory;
import com.revature.dao.UserDao;
import com.revature.dto.User;

public class ImpUser implements UserDao {
	
	public  Connection conn = ConnectionFactory.getInstance().getConnection();

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User getUserByUserName(String userName) {
		User user = new User();
		String sql = "select * from ERS_USERS where ERS_USERNAME = ?";
		System.out.println("User Name is: " + userName);
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
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
			return user;
			
		}catch(SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		return null;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
