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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import revature.pojo.UserAcct;
import revature.util.ConnectionFactory;

public class UserAcctDAOImp implements UserAcctDAO {

	// To get the balance of the user by using getBalanceById from the DB.
	@Override
	public UserAcct getBalanceById(int id) {
		UserAcct acct = new UserAcct();
		
		// Establish connection with the DB.
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			// Assign our sql string for query, prepared statement and get the result set.
			String sql = "SELECT USER_ACCT_ID FROM ACCOUNTS WHERE ACCTID = ?";
			
			PreparedStatement pstmt = conn.prepareCall(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				acct.setAcctId(rs.getInt(1));
				
			}
			
//			System.out.println("My user_acct_id is" + acct.getuser_acct_id());
			
			sql = "SELECT * FROM USER_ACCT WHERE USER_ACCT_ID = ?";
			pstmt = conn.prepareCall(sql);
			pstmt.setInt(1, acct.getuser_acct_id());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				acct.setBalance(rs.getDouble(4));
			}
			
			
		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		
		return acct;
	}

	// To update the balance of the user after a transaction.
	@Override
	public UserAcct updateBalance(UserAcct newBalance) {
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();){
			
			conn.setAutoCommit(false);
			
			String sql = "UPDATE user_acct SET balance = ? WHERE USER_ACCT_ID = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, newBalance.getBalance());
			pstmt.setInt(2, newBalance.getuser_acct_id());
			
			int rowsUpdated = pstmt.executeUpdate();
			
			if(rowsUpdated != 0) {
				conn.commit();
				return newBalance;
			}
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
			
		}
		
			System.out.println("Account Not updated!");
			
		return newBalance;
	}

}
