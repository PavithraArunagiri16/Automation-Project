
package Variables;



class Two
{
 void add()
	{
		System.out.println("Two");
		}
	
void sub(){

	System.out.println("Three");
	}

}
public class Method_overridding extends Two
{
void sub()
{
super.add();	
System.out.println("One");
super.sub();
}
	public static void main(String[] args) {
		
		Method_overridding v1=new Method_overridding();
		v1.add();
		v1.sub();
		// TODO Auto-generated method stub

	}

}