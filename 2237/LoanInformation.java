package com.htc.training.classwork;

public class LoanInformation {

	private String emp_status;
	private int emp_service;
	private String marital_status;
	private int loan_amount;
	
	public LoanInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
public LoanInformation(String emp_status, int emp_service, String marital_status) {
		super();
		this.emp_status = emp_status;
		this.emp_service = emp_service;
		this.marital_status = marital_status;
		
	}


public String getEmp_status() {
	return emp_status;
}


public void setEmp_status(String emp_status) {
	this.emp_status = emp_status;
}


public int getEmp_service() {
	return emp_service;
}


public void setEmp_service(int emp_service) {
	this.emp_service = emp_service;
}


public String getMarital_status() {
	return marital_status;
}


public void setMarital_status(String marital_status) {
	this.marital_status = marital_status;
}


public int getLoan_amount() {
	return loan_amount;
}


public void setLoan_amount(int loan_amount) {
	this.loan_amount = loan_amount;
}


public int loanEligible(String emp_status, int emp_service, String marital_status) {
	
	String perm ="Permanent" ;
	String mrtl = "Unmarried";
	System.out.println("Emp Status : " + emp_status);
	if (this.emp_status.equalsIgnoreCase(perm))
	{
	    if (this.marital_status.equalsIgnoreCase(mrtl))
	        {
	    	   if (emp_service >= 30)
    	           {	
		               loan_amount = 500000;
		               return loan_amount;
	                }
	           else 
	        	    {
	        	       loan_amount = 250000;
	                   return loan_amount;
	        	    }
	        }
	    else 
	        {
	    	   if (emp_service >= 30)
	               {	
	               return loan_amount = 600000;
                   }
               else 
     	           {
     	           return loan_amount = 350000;
     	           }
	         }
	}
	    else {
	    	 return loan_amount = 100000;
	         }
}


@Override
public String toString() {
	return "Employee Job Status is        : " + getEmp_status() + 
		 "\nEmployee Experience is        : " + getEmp_service()	+ 
		 "\nEmployee Marital Status is    : " + getMarital_status() + 
		 "\nEmployee Loan Eligibility is  : " + getLoan_amount()  ;
}
}
