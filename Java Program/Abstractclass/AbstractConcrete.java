package Abstractclass;
abstract class Facebook_Class
{
	void add()//concreate method 1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void subtract()//concreate method 2
	{
		System.out.println();
	}
	abstract void multiple();// abstract method 1
	abstract void divide();//abstract method 2
}
public class AbstractConcrete extends  Facebook_Class
{
	void modulus()
	{
		
	}
	public static void main(String[] args) {
		

	}
	@Override
	void multiple() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void divide() {
		// TODO Auto-generated method stub
		
	}
}


