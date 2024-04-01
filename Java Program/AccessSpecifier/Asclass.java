package AccessSpecifier;

public class Asclass {
	private void m1()
	{
		System.out.println("1");
	}
	public void m2()
	{
		System.out.println("2");
	}
	protected void m3()
	{
		System.out.println("3");
	}
	void m4()
	{
		System.out.println("4");
	}
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
Asclass a= new Asclass();
a.m1();
a.m2();
a.m3();
a.m4();

	}

}
