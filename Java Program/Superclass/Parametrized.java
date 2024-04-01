package Superclass;

 
	class Parent
	{
		Parent (int a)
		{System.out.println("This is a Parent Constructor");}
	}
	public class Parametrized extends Parent
	{
		Parametrized()
		
		{
super(10);
System.out.println("This is Child Constructor");
		}
	

	public static void main(String[] args) {
		
		Parametrized pa= new Parametrized();
		
		System.out.println("Im a main method");
		// TODO Auto-generated method stub

	}

}
