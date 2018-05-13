package com.revature.ers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.ers.pojo.Reimb_Status;
import com.revature.ers.pojo.User;
import com.revature.ers.util.ConnectionFactory;

public class ReimbStatusDaoImp implements ReimbStatusDao{

	@Override
	public Reimb_Status getStatusById(int id) {
		
		Reimb_Status stat = new Reimb_Status();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_reimbursement_status WHERE reimb_status_id = ?"; 
			PreparedStatement pstmt = conn.prepareCall(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
		
			while(rs.next()) {
				
				stat.setStatusId(id);
				stat.setStatus(rs.getString(2));
				
			}
			
		}catch (SQLException sqle) {
			
			sqle.printStackTrace();
		}		
		
		
		return stat;
	}

	@Override
	public Reimb_Status getStatusByStatusType(String status) {
		
		return null;
	}

}
