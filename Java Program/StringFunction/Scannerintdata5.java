package StringFunction;

import java.util.Arrays;
import java.util.Scanner;

public class Scannerintdata5 {

	public static void main(String[] args) {
		int number[]=new int[5];
		Scanner G=new Scanner(System.in);

	System.out.println("Enter the integer");
		for(int i=0; i<number.length; i++)
		{
			number [i]  =G.nextInt();
		}

		System.out.println(Arrays.toString(number));
		}
		

	}


