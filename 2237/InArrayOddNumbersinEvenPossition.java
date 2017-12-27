package com.htc.training.classwork;

import java.util.Scanner;

public class InArrayOddNumbersinEvenPossition {

	@SuppressWarnings("resource")
	public static void main (String[] args)
	{
		int evenCount=0;
		Scanner scan = null;
		try{
			Scanner input = new Scanner(System.in);
	        System.out.println("Enter the size of an Array \n");
	        int num = input.nextInt();
	        int[] numbers = new int[num];

	        for (int i = 0; i < numbers.length; i++)
	        {
	            System.out.println("Please enter number for the array position " +i + " :");
	            numbers[i] = input.nextInt();
	        }
	        System.out.print("Odd number divisable by 3 in Even position in the Array are :");
	        for (int i = 0; i < numbers.length;i= i+2)
			{
				if((numbers[i]%3)==0) 
				{
					System.out.print(numbers[i]);
					System.out.print(',');
					evenCount=evenCount+1;
				}
			}
			System.out.println("\nThe total number of Odd numbers divisible by 3 in Even positions are  :" +evenCount );
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != scan) {
				scan.close();
			}
	}
}
}	

