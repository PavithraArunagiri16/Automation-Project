package StringFunction;

public class CountofSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		boolean answer1;
		String name="Kan   tha1";
		
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isSpaceChar(a[i]);
			System.out.println(answer1);
			if (answer1==true)
			{
		count++;
			}}
		System.out.println(count);	

	}

}
