package com.htc.training.classwork;

import java.util.Scanner;

public class InArraySearchForNumberAndItsPossition {

	@SuppressWarnings({ "resource" })
	public static void main (String[] args)
	{
		
		Scanner scan = null;
		try{
			Scanner input = new Scanner(System.in);
	        System.out.println("Enter the size of an Array :");
	        int num = input.nextInt();
	        int[] numbers = new int[num];
	        for (int i = 0; i < numbers.length; i++)
	        {
	            System.out.println("Please enter number for the array position " +i + " :");
	            numbers[i] = input.nextInt();
	        }
	        System.out.print("Enter the Number you wish to find in the Array  :");
	        int findNumber = input.nextInt();
	        int setFlag=0;
	        for (int i = 0; i < numbers.length;i++)
			{
				if((numbers[i])==findNumber) 
				{				
					System.out.println("The number you entered  "+ findNumber +" in  the Array is found at the position of " +i);
					setFlag=setFlag+1;
				}
		 	}
				if(setFlag==0) 
				{				
					System.out.println("The number you entered "+ findNumber +" is not found in  the Array ");
				}
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != scan) {
				scan.close();
			}
	}
}

}
