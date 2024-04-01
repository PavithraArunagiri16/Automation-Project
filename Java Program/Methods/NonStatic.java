package Methods;

public class NonStatic {
void add()
{
	int a =50;
int b= 50;
int c=a+b;
 System.out.println(c);
}
	public static void main(String[] args) {
		System.out.println("Non Static method");
		
		NonStatic P=new NonStatic();
		P.add();

	}

}
