package StringFunction;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a1="pavithra";
		String a2="Kaniyamuthan";
		char []c1=a1.toCharArray();
		char []c2=a2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println((Arrays.toString(c1)));
		System.out.println((Arrays.toString(c2)));
		boolean a3= Arrays.equals(c1, c2);
		System.out.println(a3);
		if(a3==true)
		{
		System.out.println("Given two Strings are Anagram");
		} 
		else
		{
			System.out.println("Given two Strings are not Anagram");
		}

		

		
		// TODO Auto-generated method stub

	}

}
