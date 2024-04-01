package Forloop;

import java.util.Scanner;

public class Circle_Human {
	
	static double Pi=3.14;
	
	public static void main(String[] args) {
		
		for(int r=1;r<11;r++) 
		{
		
		Scanner F1= new Scanner(System.in);
		System.out.println("Enter radius r=");
		
		int r1=F1.nextInt();
		
		 double Area1=r1* r1* Pi;
		 
		 System.out.println(Area1);
		
		
		}
	}

}
