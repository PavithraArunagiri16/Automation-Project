package Conditionoperators;

public class Nestedif {

	public static void main(String[] args) {
		int age=19;
		double Sal=1500;
		if (age > 10)
		{
			System.out.println("Salary is Greater than 10");
			if (Sal!=1500) {
				System.out.println("Salary is equal to 1500");
			}
			else {
			System.out.println("1st else");
			}
		}
		else
		{
			System.out.println("2nd else");
			
		}
		
  }

}
 