package StringFunction;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="racecar";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse=input.charAt(i);
		//	System.out.println(reverse);
			output=output+reverse;
		//	System.out.println(output);
			
		}
		System.out.println(output);
		
		if (input.equals(output))
		{
			System.out.println("Given String is Palindrome");
		
		}
		else
		{System.out.println("Given String is not palindrome");}

	}

}
