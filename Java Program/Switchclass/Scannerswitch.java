package Switchclass;

import java.util.Scanner;

public class Scannerswitch {

	public static void main(String[] args) {
		System.out.println("Im a Scanner");
		System.out.println("Enter Switch case number");
		Scanner f1 = new Scanner(System.in) ;
		int Case=f1.nextInt();
			
			
		
		switch(Case)
		{
		
		case 1:
			
				System.out.println("Logical 1");
				break;

		case 2:
			
				System.out.println("Logic 2");
				break;
		
		case 3:
				System.out.println("Logic 3");
				break;

		case 4:
				System.out.println("Logic 4");
				break;

		default:
			System.out.println("Sorry you have made wrong selection");
				
				
		}
		

	}

}
