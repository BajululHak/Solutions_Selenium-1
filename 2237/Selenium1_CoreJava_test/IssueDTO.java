package com.htc.corejava.exam;

import java.util.Date;

public class IssueDTO {
	
	private int issueId;
	private Date issueGeneratedDate;
	private String issueCategory;
	private String issueDescription;
	
	
public IssueDTO(int issueId, Date issueGeneratedDate, String issueCategory, String issueDescription) {
		super();
		this.issueId = issueId;
		this.issueGeneratedDate = issueGeneratedDate;
		this.issueCategory = issueCategory;
		this.issueDescription = issueDescription;
	}

	public IssueDTO() {
		super();
	
	}
	
	
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public int getIssueId() {
		return issueId;
	}
	
	public Date getIssueGeneratedDate() {
		return issueGeneratedDate;
	}

	public void setIssueGeneratedDate(Date issueGeneratedDate) {
		this.issueGeneratedDate = issueGeneratedDate;
	}

	public String getIssueCategory() {
		return issueCategory;
	}

	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	@Override
	public String toString() {
		return "IssueDTO [issueId=" + issueId + ", issueGeneratedDate=" + issueGeneratedDate + ", issueCategory="
				+ issueCategory + ", issueDescription=" + issueDescription + "]";
	}



}
