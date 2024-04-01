package Abstractclass;
abstract class Credentials
{
	abstract void login();
	abstract void registration();
	}

public class Abstractclass extends Credentials{

	public static void main(String[] args) {
		
		Abstractclass L1= new Abstractclass();
		L1.login();
		L1.registration();
		// TODO Auto-generated method stub
	}
		void login()
		{
			System.out.println("login");
		}
		void registration()
		{
			System.out.println("registration");
		}
		

	}


	
	


