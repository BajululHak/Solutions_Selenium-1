package com.htc.corejava.exam;

import java.sql.SQLException;

public class IssueMain {

	public static void main(String[] args) {
		
		IssueDAOImpl impl=new IssueDAOImpl();
		try {
			
			//Insert Issue 
			IssueDTO newIssue=new IssueDTO(1001,(Date) 2017-12-28,"A1","Critical Issue A");
			IssueDAOImplSP spimpl=new IssueDAOImplSP();
			boolean flag=spimpl.insertIssue(newIssue);
			System.out.println(flag);
			
			//updating old issue object
			updatedIssue.setIssueGeneratedDate((Date) '2017-12-29');
			updatedIssue.setIssueCategory("C1");
			updatedIssue.setIssueDescription("Issue lowered to C");
			
			// Update
			boolean updateFlag=impl.updateIssue(1001, updatedIssue);
			System.out.println("UpdateFlag: "+updateFlag);
			
			//Retrieve Issue by ID
			IssueDTO getIssue=impl.getIssue(1001);
			
			// Get all Issues
			for(IssueDTO issue:impl.getAllIssue()) {
				System.out.println(issue.toString());
			}

			//insert
			boolean insertFlag=impl.insertIssue(new IssueDTO(1002, (Date) 2017-12-27,"B1","Medium Issue B"));
			System.out.println("InsertFlag: "+insertFlag);
			
			//delete
			boolean deleteFlag=impl.deleteIssue(1002);
			System.out.println("DeleteFlag: "+deleteFlag);
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
