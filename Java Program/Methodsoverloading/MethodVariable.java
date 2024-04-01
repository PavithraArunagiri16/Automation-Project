package Methodsoverloading;

public class MethodVariable {
	void add()
	{System.out.println("Addition");}
	void add (int a)
	{System.out.println(a);}
	void add (int a,double b)
	{System.out.println(a+b);}
	void add (double a,int b)
	{System.out.println(a+b);}
	static void add (String a,double v,int b)
	{System.out.println(a);
	System.out.println(v);
	System.out.println(b);}
  
	public static void main(String[] args) {
		MethodVariable.add("pavi",6.6,7);
		//add("pavi",6.6,7);
	MethodVariable m1=new MethodVariable();
	m1.add();
	m1.add(10);
	m1.add(4,4.4);
	m1.add(10.4,3);

	}

}
