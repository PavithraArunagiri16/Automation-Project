package arithmeticoperators;
public class Arithmetic_Operator {
	static int a=600;
	static int b=200;
	static int c;
	 
			 static void add() 
         {
	        int c = a+b;
				
				System.out.println(c);}
			static void sub() {
				 int c = a-b;
				
				System.out.println(c);}
			static void multiple() {
				 int c = b*a;
				 System.out.println(c);			}
			static void division() {
				 int c = a/b;
				 System.out.println(c);}
			
public static void main(String[] args) {
		
				System.out.println("Main Method");
				add();
				sub();
				multiple() ;
				division() ;
				
}}

