package StringFunction;

public class Countofalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countalpha=0;
		boolean answer1;
		String name="Kantha1";
		
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isAlphabetic(a[i]);
			System.out.println(answer1);
			if (answer1==true)
			{
		countalpha++;
			}}
		System.out.println(countalpha);	

	}

}
