package StringFunction;

public class Onlydigit {

	public static void main(String[] args) {
		String name= "Kaniyamuthan";
		int length= name.length();
		System.out.println(length);
		int countalpha=0;
		
		boolean answer1;
	
		
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isDigit(a[i]);
			//System.out.println(answer1);
			if (answer1==true)
			{
		countalpha++;
			}
			
		}
		if (countalpha!=0)
		{
			System.out.println("Given String consist of Digit");

		}
		else
		{
			System.out.println("Given String not consist of Digit");
		}
		
		

		
	}}
