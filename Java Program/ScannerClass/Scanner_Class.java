package ScannerClass;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		System.out.println("Im a Scanner");
		Scanner f1 = new Scanner(System.in) ;
			//f1.nextInt();
			System.out.println("Enter 1st number");
			 int Firstno=f1.nextInt();
				System.out.println("Enter 2nd number");
				 int Secondno=f1.nextInt();
				 int Sum=Firstno+Secondno;
				 System.out.println(Sum);
				 f1.close();
		}
	

}
