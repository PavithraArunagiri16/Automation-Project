package ScannerClass;

import java.util.Scanner;

public class AreaofCircle {
	
	final static double Pi=3.14;
	

	public static void main(String[] args) {
		System.out.println("Area of Circle");
		Scanner r = new Scanner(System.in) ;
		
			System.out.println("Enter radius r=");
			//int radius=r.nextInt();
			double radius1=r.nextDouble();
			
				 double Area1=radius1* radius1 * Pi;
				 
				 System.out.println(Area1);
				

	}

}
