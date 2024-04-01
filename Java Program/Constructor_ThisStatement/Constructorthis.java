package Constructor_ThisStatement;

//import ConstructorOverloading.Constructorthis;

public class Constructorthis {
Constructorthis(int a)
{
this('c');
System.out.println("Constructor 1 Integer");}
Constructorthis(char b)
{
	this("akila");
	System.out.println("Constructor 2 Char");}
Constructorthis(String abi)
{System.out.println("Constructor 3 String");}
Constructorthis(boolean b)
{System.out.println("Constructor 4 boolean");}
Constructorthis(int k,boolean b, String c)
{System.out.println("Constructor 5 Multiple");}

	public static void main(String[] args) {
		new Constructorthis(10);
       // new Constructor5('a');
        //new Constructor5("hello");
        //new Constructor5(true);
        //new Constructor5(10, true, "world");

	}

}
