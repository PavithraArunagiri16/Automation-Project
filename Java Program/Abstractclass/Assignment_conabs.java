package Abstractclass;
abstract class Parentmethod
{void add()//concreate method 1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void subtract()//concreate method 2
	{
		int c=50;
		int d=60;
		System.out.println(d-c);
	}
	abstract void login1();// abstract method 1
	abstract void login2();//abstract method 2
}
public class Assignment_conabs extends  Parentmethod
{
	void modulus()
	{
		System.out.println("modulus");
	}
	public static void main(String[] args) {
		Assignment_conabs g= new Assignment_conabs();
		g.login1();
		g.login2();
		g.add();
		g.subtract();
		g.modulus();
		}
	void login1() {
		System.out.println("login1");
		// TODO Auto-generated method stub
		}

	void login2() {
		System.out.println("login2");
		// TODO Auto-generated method stub
		
	}}

