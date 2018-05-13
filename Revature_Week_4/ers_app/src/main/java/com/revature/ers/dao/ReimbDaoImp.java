package com.revature.ers.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.ers.pojo.Reimbursement;
import com.revature.ers.util.ConnectionFactory;

public class ReimbDaoImp implements ReimbDao {

	// Gets all the tickets submitted and resolved for reimbursement
	@Override
	public ArrayList<Reimbursement> getAllReimbursement() {
		
		ArrayList<Reimbursement> reimb = new ArrayList<Reimbursement>();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ERS_REIMBURSEMENT";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Reimbursement temp = new Reimbursement();
				temp.setReimbId(rs.getInt(1));
				temp.setReimbAmount(rs.getDouble(2));
				temp.setSubDate(rs.getTimestamp(3));
				temp.setResolved(rs.getTimestamp(4));
				temp.setDesc(rs.getString(5));
				temp.setAuthor(rs.getInt(7));
				temp.setResolver(rs.getInt(8));
				temp.setStatusId(rs.getInt(9));
				temp.setType(rs.getInt(10));
				
				reimb.add(temp);
				
				
			}
			
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return reimb;
	}
	
	// Gets reimbursement information by ID
	@Override
	public Reimbursement getReimbById(int id) {
		
		Reimbursement reimb = new Reimbursement();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_reimbursement WHERE reimb_id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				reimb.setReimbId(id);
				reimb.setReimbAmount(rs.getDouble(2));
				reimb.setSubDate(rs.getTimestamp(3));
				reimb.setResolved(rs.getTimestamp(4));
				reimb.setDesc(rs.getString(5));
				reimb.setAuthor(rs.getInt(7));
				reimb.setResolver(rs.getInt(8));
				reimb.setStatusId(rs.getInt(9));
				reimb.setType(rs.getInt(10));
				
			}
			
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		
		return reimb;
	}

	// Gets all the reimbursements by the status id
	@Override
	public ArrayList<Reimbursement> getReimbByStatusId(int id) {
		
		ArrayList<Reimbursement> reimb = new ArrayList<Reimbursement>();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_reimbursement WHERE reimb_status_id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Reimbursement temp = new Reimbursement();
				temp.setReimbId(rs.getInt(1));
				temp.setReimbAmount(rs.getDouble(2));
				temp.setSubDate(rs.getTimestamp(3));
				temp.setResolved(rs.getTimestamp(4));
				temp.setDesc(rs.getString(5));
				temp.setAuthor(rs.getInt(7));
				temp.setResolver(rs.getInt(8));
				temp.setStatusId(rs.getInt(9));
				temp.setType(rs.getInt(10));
				
				reimb.add(temp);
			}
			
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		
		return reimb;
	}
	
	// Gets the reimbursements by the type id
	@Override
	public ArrayList<Reimbursement> getReimbByType(int id) {
		
		ArrayList<Reimbursement> reimb = new ArrayList<Reimbursement>();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_reimbursement WHERE reimb_type_id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Reimbursement temp = new Reimbursement();
				temp.setReimbId(rs.getInt(1));
				temp.setReimbAmount(rs.getDouble(2));
				temp.setSubDate(rs.getTimestamp(3));
				temp.setResolved(rs.getTimestamp(4));
				temp.setDesc(rs.getString(5));
				temp.setAuthor(rs.getInt(7));
				temp.setResolver(rs.getInt(8));
				temp.setStatusId(rs.getInt(9));
				temp.setType(rs.getInt(10));
				
				reimb.add(temp);
			}
			
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		return reimb;
	}

	// Adds tickets to the reimbursement table
	@Override
	public Reimbursement addReimbursement(Reimbursement rmb) {
		
		Reimbursement reimb = null;
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			conn.setAutoCommit(false);
			
			String sql = "{CALL new_reimbursement(?,?,?,?,?)}";
			
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setDouble(1, rmb.getReimbAmount());
			cs.setString(2, rmb.getDesc());
			cs.setInt(3, rmb.getAuthor());
			cs.setInt(4, rmb.getStatusId());
			cs.setInt(5, rmb.getType());
			
			
			int rowsUpdated = cs.executeUpdate();
			
			if(rowsUpdated != 0) {
				reimb = rmb;
				conn.commit();
			}
						
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return reimb;
	}

	// Update tickets for reimbursements
	@Override
	public Reimbursement updateReimbursement(Reimbursement reimb) {
		
		Reimbursement updatedReimb = new Reimbursement();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			conn.setAutoCommit(false);
			
			String sql = "UPDATE ers_reimbursement SET reimb_status_id = ?,"
					+ "reimb_last_updated = ?  WHERE reimb_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, reimb.getStatusId());
			pstmt.setTimestamp(2, reimb.getResolved());
			pstmt.setInt(3, reimb.getReimbId());
			
			int rowsUpdated = pstmt.executeUpdate();
			
			if(rowsUpdated != 0 ) {
				conn.commit();
				updatedReimb = getReimbById(reimb.getReimbId());
			}
			
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return updatedReimb;
	}

	@Override
	public ArrayList<Reimbursement> getReimbByAuthor(int id) {
		
		ArrayList<Reimbursement> reimb = new ArrayList<Reimbursement>();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection();) {
			
			String sql = "SELECT * FROM ers_reimbursement WHERE reimb_author = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Reimbursement temp = new Reimbursement();
				temp.setReimbId(rs.getInt(1));
				temp.setReimbAmount(rs.getDouble(2));
				temp.setSubDate(rs.getTimestamp(3));
				temp.setResolved(rs.getTimestamp(4));
				temp.setDesc(rs.getString(5));
				temp.setAuthor(id);
				temp.setResolver(rs.getInt(8));
				temp.setStatusId(rs.getInt(9));
				temp.setType(rs.getInt(10));
				
				reimb.add(temp);
			}
			
			
		} catch(SQLException sqle) {
			
			sqle.printStackTrace();
		}
		
		
		return reimb;
	}

	

}
