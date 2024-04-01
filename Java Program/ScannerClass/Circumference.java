package ScannerClass;

import java.util.Scanner;

public class Circumference {
	final static double Pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Circumference");
		Scanner r1 = new Scanner(System.in) ;
		
			System.out.println("Enter radius r=");
			
			double radius1=r1.nextDouble();
			
				 double Circum= 2* radius1 * Pi;
				 
				 System.out.println(Circum);
				

	}


	}


