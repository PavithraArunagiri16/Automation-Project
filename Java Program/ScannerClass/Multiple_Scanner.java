package ScannerClass;

import java.util.Scanner;

public class Multiple_Scanner {

	public static void main(String[] args) {
		System.out.println("Im a Scanner");
		Scanner f1 = new Scanner(System.in) ;
			String name = f1.next();
			byte b1 = f1.nextByte();
			Short b2 = f1.nextShort();
			int b3= f1.nextInt();
			long b4= f1.nextLong();
			float b5= f1.nextFloat();
			double b6=f1.nextDouble();
			boolean b7=f1.nextBoolean();
			 f1.close();
		// TODO Auto-generated method stub

	}

}
