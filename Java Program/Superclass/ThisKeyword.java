package Superclass;

public class ThisKeyword {
String name;
int age;
double Salary;
void Stu_Details(String name,int age,double Salary)
{
	System.out.println("I am"+name+"and my age is"+age+"and my Salary"+Salary);
	this.name=name;
}

	public static void main(String[] args) {
		ThisKeyword TK= new ThisKeyword();
		TK.Stu_Details("Kani",4,9438.593);
		System.out.println(TK.name);
		System.out.println(TK.age);
		System.out.println(TK.Salary);

		// TODO Auto-generated method stub

	}

}
