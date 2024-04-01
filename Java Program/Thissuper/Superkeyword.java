package Thissuper;

class Two
{
	void add()
	{
		System.out.println("Two");
		}
	
void sub(){

	System.out.println("Three");
	}

}
public class Superkeyword extends Two
{
void add()
{
//super.add();	
System.out.println("One");
}
	public static void main(String[] args) {
		
		Superkeyword v1=new Superkeyword();
		v1.add();
		v1.sub();
		// TODO Auto-generated method stub

	}

}
