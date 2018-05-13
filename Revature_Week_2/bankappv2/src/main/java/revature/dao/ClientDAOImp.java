/*********************************************************************** 
Program Name: Bank App v2
Author: Antonio Marrero Bonilla
Contributors: Zachary Vaughn, Dennis Park
Company: Revature
Week Iteration: Week 2
Program Description: Bank application where the user can register,
login and perform transactions with their money such as: deposit,
withdrawals, and check balances. Requirements for users to register
are to provide a username and password. 
***********************************************************************/

package revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import revature.pojo.Client;
import revature.util.ConnectionFactory;

public class ClientDAOImp implements ClientDAO {

	@Override
	public ArrayList<Client> getAllClient() {
		
		ArrayList<Client> client = new ArrayList<Client>();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM client";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				Client temp = new Client();
				temp.setAcctId(rs.getInt(1));
				temp.setUserName(rs.getString(2));
				temp.setFirstName(rs.getString(3));
				temp.setLastName(rs.getString(4));
				temp.setPassword(rs.getString(5));
				client.add(temp);
			
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
		return client;
	}

	@Override
	public boolean addClient(String[] newClient) {
		
		boolean executed = false;
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			conn.setAutoCommit(false);
			
			String sql = "{CALL open_account(?,?,?,?)}";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, newClient[0]);
			cs.setString(2, newClient[1]);
			cs.setString(3, newClient[2]);
			cs.setString(4, newClient[3]);
			
			if(cs.execute()) {
				
				executed = true;
				conn.commit();
			}
			
			return executed;
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
		return false;
	}

	@Override
	public Client getClientById(int id) {
		
		Client client = new Client();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM client WHERE acctid = ?";
			PreparedStatement pstmt = conn.prepareCall(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				client.setAcctId(id);
				client.setUserName(rs.getString(2));
				client.setFirstName(rs.getString(3));
				client.setLastName(rs.getString(4));
				client.setPassword(rs.getNString(5));
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
		
		return client;
	}

	@Override
	public boolean updateClient(Client newName) {
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			conn.setAutoCommit(false);
			
			String sql = "UPDATE client SET username = ?, firstname = ?, lastname = ?,"
					+ "password = ? WHERE acctid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newName.getUserName());
			pstmt.setString(2, newName.getFirstName());
			pstmt.setString(3, newName.getLastName());
			pstmt.setString(4, newName.getPassword());
			pstmt.setInt(5, newName.getAcctId());
			
			int rowsUpdated = pstmt.executeUpdate();
			
			if(rowsUpdated != 0) {
				
				conn.commit();
				return true;
				
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
		return false;
	}

	
	public Client loginByUserName(String un, String pw) {
		
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM client WHERE username=? AND password=?";
			Client c = new Client();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, un);
			pstmt.setString(2, pw);	
			
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			c.setAcctId(rs.getInt(1));
			c.setUserName(rs.getString(2));
			c.setFirstName(rs.getString(3));
			
			return c;
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
		return null;
	}
}
