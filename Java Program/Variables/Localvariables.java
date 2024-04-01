package Variables;

public class Localvariables {
	void add()
	{ 
		int a=100;
		System.out.println(a+10);
	}
	void sub()
	{ 
		int b=100;
		System.out.println(b-10);

	}
	void mul()
	{
		String a;
		a= "my name is string";
		System.out.println(a);
	}
	static void div(String a,boolean b)
	{
		System.out.println(a);
		System.out.println(b);

		}
	public static void main(String[] args) {
		Localvariables s =new Localvariables();
		 s.add();
		 s.sub();
		 s.mul();
		 s.div("ak", false);
		 
		// TODO Auto-generated method stub

	}

}
