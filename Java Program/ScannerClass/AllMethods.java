package ScannerClass;

import java.util.Scanner;

public class AllMethods {
	static int a;
	static int b;
	 void add()
	 {
		 int sum=a+b;
		 System.out.println(sum);
	 }
	 void sub()
	 {
		 int sub=a-b;
		 System.out.println(sub);
	 }
	 void mul()
	 {
		 int mul=a*b;
		 System.out.println(mul);
	 }
	 void mod()
	 {
		 int mod=b%a;
		 System.out.println(mod);
	 }
	public static void main(String[] args) {
		System.out.println("Im a Scanner");
		Scanner f1 = new Scanner(System.in) ;
		System.out.println("Enter a number");
		  a=f1.nextInt();
		System.out.println("Enter b number");
		 b=f1.nextInt();
		AllMethods D= new AllMethods();
		D.add();
		D.sub();
		D.mul();
		D.mod();
		f1.close();
	}


}

