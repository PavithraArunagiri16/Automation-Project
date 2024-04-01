package StringFunction;

import java.util.Arrays;

public class ArrayitterationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[4];
		 number[0]=5;
				 number[1]=6;
				 number[2]=3;
				 number[3]=2;
				 int Answer1[]= new int[5];
				 
				  for( int i=0;i<number.length;i++)
						  {
					  Answer1[i]=number[i];
						  }
				System.out.println(Arrays.toString(number));
				System.out.println(Arrays.toString(Answer1));				
				
				boolean answer= Arrays.equals(number,Answer1);
				 if (answer==true)
				 {
					 System.out.println("Given 2 Strings are Equal");
				 }
				 else
				 {
					 System.out.println("Given 2 Strings are not Equal");
				 }
	}

}
