package Superclass;
class Mentor
{
	Mentor()
	
	{System.out.println("Mentor class will help to Student");
	}
}

public class Supercalling extends Mentor
{
	//Supercalling()
	
	{
		System.out.println("Student class will seek to Help1");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supercalling A= new Supercalling();
	}

}
