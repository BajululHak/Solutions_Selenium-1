package com.htc.training.classwork;
import java.util.Scanner;


public class SeriesOneandTwoLogics {

	public static void main(String[] args) {
		int number;
		int calculate=1;
		Scanner scan = null;
		try {
			System.out.print("Enter n value : ");
			scan = new Scanner(System.in);
			int n = scan.nextInt();
			System.out.println("Series one....");
			System.out.println("**************");
			number=1;
			for (int i = 0; i <= n; i++) {
				
				if (calculate % 2 != 0) {
				System.out.print(number);
				System.out.print(",");
				}
				else
				{
					System.out.print(-number);
					System.out.print(",");	
				}
				number = number + 2;
				calculate++;
			}
			System.out.print("...... So on :) \n");
			
			System.out.println("\n Series Two....");
			System.out.println("**************");
			number=1;
			for (int i = 0; i <= n; i++) {
				
				System.out.print("1/"+number);
				System.out.print(",");	
				number = number + 1;
			}
			System.out.print("...... So on :)");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != scan) {
				scan.close();
			}
		}
	}


}





