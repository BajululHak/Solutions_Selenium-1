package com.htc.corejava.exam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class IssueDAOImpl implements IissueServiceProvider {
	
	@Override
	public boolean insertIssue(IssueDTO newIssue) throws SQLException {
		boolean insertFlag = false;

		Connection con = DBConnector.getConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO Issue(issueId,issueGeneratedDate,issueCategory,issueDescription) VALUES(?,?,?,?)");
		ps.setInt(1, newIssue.getIssueId());
		ps.setDate(2, (Date) newIssue.getIssueGeneratedDate());
		ps.setString(3, newIssue.getIssueCategory());
		ps.setString(4, newIssue.getIssueDescription());
		
		insertFlag = !ps.execute(); 

		return insertFlag;
	}
	
	@Override
	public boolean deleteIssue(int issueId) throws SQLException {
		boolean deleteFlag = false;
		Connection con = DBConnector.getConnection();
		PreparedStatement ps = con.prepareStatement("DELETE FROM Issue WHERE issueId=?");
		ps.setInt(1, issueId);
		deleteFlag = !ps.execute();   
		return deleteFlag;
	}
	
	@Override
	public boolean updateIssue(int issueId, IssueDTO updatedIssue) throws SQLException {
		boolean updateFlag = false;

		Connection con = DBConnector.getConnection();
		PreparedStatement ps = con.prepareStatement("UPDATE Issue SET issueGeneratedDate=?,issueCategory=?,issueDescription=? WHERE issueId=?");
		ps.setDate(1, (Date) updatedIssue.getIssueGeneratedDate());
		ps.setString(2, updatedIssue.getIssueCategory());
		ps.setString(3, updatedIssue.getIssueDescription());
		ps.setInt(4, issueId);

		updateFlag = !ps.execute(); 
		return updateFlag;
	}
	@Override
	public IssueDTO getIssue(int issueId) throws SQLException {
		IssueDTO Issue = null;
		Connection con = DBConnector.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT issueGeneratedDate,issueCategory,issueDescription FROM Issue WHERE issueId=?");
		ps.setInt(1, issueId);
		ResultSet rs = ps.executeQuery();
		rs.next();  
		Issue = new IssueDTO(issueId, rs.getDate(1), rs.getString(2), rs.getString(3));
		return Issue;
	}
	public ArrayList<IssueDTO> getAllIssue() throws SQLException {
		ArrayList<IssueDTO> Issues = new ArrayList<>();
		Connection con=DBConnector.getConnection();
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("SELECT issueId,issueGeneratedDate,issueCategory,issueDescription FROM Issue");
		while(rs.next()) {
			Issues.add(new IssueDTO(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getString(4)));
		}
		return Issues;
	}

}
