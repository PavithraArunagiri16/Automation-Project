package StringFunction;

public class CountofDigit {

	public static void main(String[] args) {
		int count=0;
		boolean answer1;
		String name="Kantha1";
		
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isDigit(a[i]);
			System.out.println(answer1);
			if (answer1==true)
			{
		count++;
			}}
		System.out.println(count);	
		}
		// TODO Auto-generated method stub

	}


