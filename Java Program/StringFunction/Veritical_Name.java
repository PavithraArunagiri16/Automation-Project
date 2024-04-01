package StringFunction;

public class Veritical_Name {
	static void Reverse()
	{
	String name="Pavithra";
	for(int i=0;i<name.length();i++)
	{
	//for(int i=name.length()-1;i>=0;i--)

	
	char a = name.charAt(i);
	System.out.println(a);
	}
	}
	public static void main(String[] args) {
		Reverse();
		System.out.println("---------------");
		// TODO Auto-generated method stub
		String name="Pavithra";
		//for(int i=0;i<name.length();i++)
		for(int i=name.length()-1;i>=0;i--)

		{
		char a = name.charAt(i);
		System.out.println(a);
		}

	}

}
