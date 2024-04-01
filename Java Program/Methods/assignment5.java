package Methods;

public class assignment5 {

	static void add() 
         {
				 int a=600;
				 int b=200;
				 int c = a+b;
				
				System.out.println(c);}
			static void sub() {
				int a=600;
				 int b=200;
				 int c = a-b;
				
				System.out.println(c);}
			static void multiple() {
				int a=600;
				 int b=200;
				 int c = b*a;
				 System.out.println(c);			}
			static void division() {
				int a=600;
				 int b=200;
				 int c = a/b;
				 System.out.println(c);}
			
			void add1() 
	         {
					 int a=600;
					 int b=200;
					 int c = a+b;
					
					System.out.println("Sum"+c);
					}
			void sub2() {
					int a=600;
					 int b=200;
					 int c = a-b;
					
					System.out.println("subraction"+c);
					}
				void multiple3() {
					int a=600;
					 int b=200;
					 int c = b*a;
					 System.out.println("Multiplication"+c);			
					 }
				void division4() {
					int a=600;
					 int b=200;
					 int c = a/b;
					 System.out.println("Division"+c);
					 }
				
			
public static void main(String[] args) {
		
				System.out.println("Main Method");
				add();
				sub();
				multiple() ;
				division() ;
				assignment5 P= new assignment5();
				P.add1();
				P.sub2();
				P.multiple3() ;
				P.division4() ;
				
}}