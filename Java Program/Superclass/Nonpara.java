package Superclass;

class Firstparent
{
	Firstparent()
	{System.out.println("This is a Parent Constructor");}
}
public class Nonpara extends Firstparent
{
	Nonpara()
	

{System.out.println("This is Child Constructor");
	}


public static void main(String[] args) {
	
	Nonpara pa= new Nonpara();
	
	System.out.println("Im a main method");
	// TODO Auto-generated method stub

}}
