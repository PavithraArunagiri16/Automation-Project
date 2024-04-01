package ConstructorOverloading;

public class Constructor5 {
Constructor5(int a)
{System.out.println("Constructor 1 Integer");}
Constructor5(char b)
{System.out.println("Constructor 2 Char");}
Constructor5(String abi)
{System.out.println("Constructor 3 String");}
Constructor5(boolean b)
{System.out.println("Constructor 4 boolean");}
Constructor5(int k,boolean b, String c)
{System.out.println("Constructor 5 Multiple");}

	public static void main(String[] args) {
		new Constructor5(10);
       // new Constructor5('a');
        //new Constructor5("hello");
        //new Constructor5(true);
        //new Constructor5(10, true, "world");

	}

}
