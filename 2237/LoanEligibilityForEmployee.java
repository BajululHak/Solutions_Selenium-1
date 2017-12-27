package com.htc.training.classwork;

public class LoanEligibilityForEmployee {

	public static void main(String[] args) {
		
		System.out.println("Loan eligibility for an employee who is unmarried permanent job holder and service has been for 30 years");
		LoanInformation loanInfoPermUnMarried1=new LoanInformation("Permanent",31,"Unmarried");
		loanInfoPermUnMarried1.loanEligible(loanInfoPermUnMarried1.getEmp_status(), loanInfoPermUnMarried1.getEmp_service(), loanInfoPermUnMarried1.getEmp_status());
        System.out.println(loanInfoPermUnMarried1.toString());

        System.out.println("\nLoan eligibility for an employee who is unmarried permanent job holder and service has been for below 30 years");
		LoanInformation loanInfoPermUnMarried2=new LoanInformation("Permanent",29,"Unmarried");
		loanInfoPermUnMarried2.loanEligible(loanInfoPermUnMarried2.getEmp_status(), loanInfoPermUnMarried2.getEmp_service(), loanInfoPermUnMarried2.getEmp_status());
        System.out.println(loanInfoPermUnMarried2.toString());
        
		System.out.println("\nLoan eligibility for an employee who is Married permanent job holder and service has been for 30 years");
		LoanInformation loanInfoPermMarried1=new LoanInformation("Permanent",31,"Married");
		loanInfoPermMarried1.loanEligible(loanInfoPermMarried1.getEmp_status(), loanInfoPermMarried1.getEmp_service(), loanInfoPermMarried1.getEmp_status());
        System.out.println(loanInfoPermMarried1.toString());

        System.out.println("\nLoan eligibility for an employee who is Married permanent job holder and service has been for below 30 years");
		LoanInformation loanInfoPermMarried2=new LoanInformation("Permanent",29,"Married");
		loanInfoPermMarried2.loanEligible(loanInfoPermMarried2.getEmp_status(), loanInfoPermMarried2.getEmp_service(), loanInfoPermMarried2.getEmp_status());
        System.out.println(loanInfoPermMarried2.toString());

        System.out.println("\nLoan eligibility for an employee who is unmarried Temporaty job holder and service has been for 30 years");
        LoanInformation loanInfoTemp=new LoanInformation("Temporary",30,"Unmarried");
        loanInfoTemp.loanEligible(loanInfoTemp.getEmp_status(), loanInfoTemp.getEmp_service(), loanInfoTemp.getEmp_status());
        System.out.println(loanInfoTemp.toString());
         
         

	}

}
