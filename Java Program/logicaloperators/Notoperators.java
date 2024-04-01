package logicaloperators;

public class Notoperators {

	public static void main(String[] args) {
		int age=19;
		double Sal=1500;
		if (!(age < 10 || Sal!=1500))		{
			System.out.println("TRUE");
		}
		else {System.out.println("FALSE");}
	}

}