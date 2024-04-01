package Polimorphism;
class parentclass
{
	void add()
	{System.out.println("Parent Method");}
	}
public class Methodoverriding extends parentclass {
	void add()
	{
		super.add();
		System.out.println("Chiild method Method");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Methodoverriding m1= new Methodoverriding();
		parentclass m1= new parentclass();
  m1.add();
	}

}
