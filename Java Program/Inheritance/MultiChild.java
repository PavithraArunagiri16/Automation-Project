package Inheritance;
class GrandParent
{
void add() 
{	System.out.println("I am a GrandParent");

}
}
class Firstparent extends GrandParent
{
static void add1() 
{	System.out.println("I am a Parent");

}
}

public class MultiChild extends Firstparent {

	public static void main(String[] args) {
		MultiChild a= new MultiChild();
		
	
		 add1();
		 a.add();
			{
			
			System.out.println("I am a Child-Main method");
		

		// TODO Auto-generated method stub

	}

	}}
