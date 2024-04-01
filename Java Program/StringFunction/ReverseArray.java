package StringFunction;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[4];
		 int k=number.length-1;

		 number[0]=5;
				 number[1]=6;
				 number[2]=3;
				 number[3]=2;
				 int Answer1[]= new int[5];
				 
				  for( int i=0;i<number.length;i++)
						  {
					  Answer1[k]=number[i];
					  k--;
						  }
				 Arrays.toString(number);
				 System.out.println("first array" + Arrays.toString(number));
				 System.out.println("Secon array" + Arrays.toString(Answer1));
	}

}
