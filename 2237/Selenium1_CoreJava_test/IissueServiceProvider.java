package com.htc.corejava.exam;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IissueServiceProvider {
	
	public boolean insertIssue(IssueDTO newIssue) throws SQLException;
	public boolean deleteIssue(int issueID)throws SQLException;
	public boolean updateIssue(int issueId,IssueDTO updatedissueId)throws SQLException;
	public IssueDTO getIssue(int issueId)throws SQLException;
	public ArrayList<IssueDTO> getAllIssue()throws SQLException;

}
