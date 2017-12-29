package com.htc.corejava.exam;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

public class IssueDAOImplSP implements IissueServiceProvider {

	@Override
	public boolean insertIssue(IssueDTO newIssue) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call INSERTISSUE(?,?,?,?)}");
		cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
		cstmt.setInt(2, newIssue.getIssueId());
		cstmt.setDate(3, (Date) newIssue.getIssueGeneratedDate());
		cstmt.setString(4, newIssue.getIssueCategory());
		cstmt.setString(5, newIssue.getIssueDescription());

		cstmt.execute();
		int flag = cstmt.getInt(1);
		if (flag == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteIssue(int issueId) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call DELETEISSUE(?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, issueId);
		cstmt.execute();
		if (cstmt.getBoolean(1)) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateIssue(int issueId, IssueDTO updatedIssue) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call UPDATEISSUE(?,?,?,?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, issueId);
		cstmt.setDate(3, (Date) updatedIssue.getIssueGeneratedDate());
		cstmt.setString(4, updatedIssue.getIssueCategory());
		cstmt.setString(5, updatedIssue.getIssueDescription());
		cstmt.execute();
		if (cstmt.getBoolean(1)) {
			return true;
		} else
			return false;
	}

	@Override
	public IssueDTO getIssue(int issueId) throws SQLException {

		return null;
	}

	public ArrayList<IssueDTO> getAllIssues() throws SQLException {
		
		return null;
	}

	@Override
	public ArrayList<IssueDTO> getAllIssue() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
