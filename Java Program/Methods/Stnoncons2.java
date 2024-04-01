package Methods;

public class Stnoncons2 {

	static void add() 
         {
				 int a=600;
				 int b=200;
				 int c = a+b;
				
				System.out.println(c);}
	void add1()
	{
		int a =50;
	int b= 50;
	int c=a+b;
	 System.out.println(c);}
	
	Stnoncons2()
	{
		System.out.println("Im the constructor");
	}

	public static void main(String[] args) {
		System.out.println("MainMethod");
		add();
		Stnoncons2 P = new Stnoncons2();
		P.add1();
		new Stnoncons2 ();

	}

}
