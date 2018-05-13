package com.revature.ers.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.ers.pojo.Reimbursement;
import com.revature.ers.pojo.User;
import com.revature.ers.util.ConnectionFactory;

public class UsersDaoImp implements UsersDao {
	
	
	
	// Add new users to the DB.
	@Override
	public User addUser(User usr) {
			
		User user = null;
			
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
				
			conn.setAutoCommit(false);
				
			String sql = "{CALL new_user(?,?,?,?,?,?)}";
			
//			String[] keys = new String[1];
//			keys[0] = "ers_users_id";
			
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setString(1, usr.getUserName());
			cs.setString(2, usr.getPw());
			cs.setString(3, usr.getFirstName());
			cs.setString(4, usr.getLastName());
			cs.setString(5, usr.getEmail());
			cs.setInt(6, usr.getUserRoleId());
				
			int rowsUpdated = cs.executeUpdate();
			
//			ResultSet rs = cs.getGeneratedKeys();
				
			if(rowsUpdated != 0) {
				
				user = usr;
				conn.commit();
				
			}
				
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
			
		return user;
	}


	// Get the user by ID from DB.
	@Override
	public User getUserById(int id) {
		
		User user = new User();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_users WHERE ers_users_id = ?";
			
			PreparedStatement pstmt = conn.prepareCall(sql);
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
		
			while(rs.next()) {
				
				user.setUserId(id);
				user.setUserName(rs.getString(2));
				user.setPw(rs.getString(3));
				user.setFirstName(rs.getString(4));
				user.setLastName(rs.getString(5));
				user.setEmail(rs.getString(6));
				user.setUserRoleId(rs.getInt(7));

				
			}
			
		}catch (SQLException sqle) {
			
			sqle.printStackTrace();
			
		}		
		
		return user;
		
	}
	
	
	// Get user by User Name.
	@Override
	public User getUserByUsername(String user) {
			
		User myUser = new User();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {

			String sql = "SELECT * FROM ers_users WHERE ers_username = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user);
			
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				
				myUser.setUserId(rs.getInt(1));
				myUser.setUserName(user);
				myUser.setPw(rs.getString(3));
				myUser.setFirstName(rs.getString(4));
				myUser.setLastName(rs.getString(5));
				myUser.setEmail(rs.getString(6));
				myUser.setUserRoleId(rs.getInt(7));
				
			}


		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
			
		}		
		
		return myUser;
		
	}
	

	@Override
	public User getUserByEmail(String email) {
	
		User user = new User();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_users WHERE user_email = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setPw(rs.getString(3));
				user.setFirstName(rs.getString(4));
				user.setLastName(rs.getString(5));
				user.setEmail(email);
				user.setUserRoleId(rs.getInt(7));
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		return user;
	}
	
	
	// Update user information in the DB.
	@Override
	public User updateUser(User user) {
		
		User updatedUser = new User();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			conn.setAutoCommit(false);
			
			String sql = "UPDATE ers_users SET ers_password = ?, user_first_name = ?,"
					+ " user_last_name = ?, user_email = ? WHERE ers_users_id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user.getPw());
			pstmt.setString(2, user.getFirstName());
			pstmt.setString(3, user.getLastName());
			pstmt.setString(4, user.getEmail());
			pstmt.setInt(5, user.getUserId());
			
			int rowsUpdated = pstmt.executeUpdate();
			
			if(rowsUpdated != 0) {
				
				conn.commit();
				updatedUser = getUserById(user.getUserId());
				
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
		return updatedUser;
		
	}


	@Override
	public ArrayList<User> getAllUsers() {
		
		ArrayList<User> users = new ArrayList<User>();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_users";
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
			
			User temp = new User();
			temp.setUserId(rs.getInt(1));
			temp.setUserName(rs.getString(2));
			temp.setPw(rs.getString(3));
			temp.setFirstName(rs.getString(4));
			temp.setLastName(rs.getString(5));
			temp.setEmail(rs.getString(6));
			temp.setUserRoleId(rs.getInt(7));
			
			users.add(temp);
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
		return users;
	}


	
}
