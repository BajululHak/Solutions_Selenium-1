package com.htc.training.classwork;

import java.util.Scanner;

public class InArrayCountTheNumberOfPrimeNumber {
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

	        int setFlag=0;
	        for (int i = 0; i < numbers.length;i++)
			{
	        	if (numbers[i]==1 || numbers[i]==0)
				{ 
					setFlag=setFlag+0;					
				}
	        	else if ( numbers[i]==2 || numbers[i]==3)
				{
					setFlag=setFlag+1;
				}
	        	else if(((numbers[i]*numbers[i])-1) % 24 == 0 ) 
				{				
					setFlag=setFlag+1;
				}
		 	}
				if(setFlag==0) 
				{				
					System.out.println("There are No Prime Number found in  the given Array");
				}
				else if(setFlag>=1)
				{				
					System.out.println("There are "+ setFlag +" Prime Number found in  the given Array");
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
