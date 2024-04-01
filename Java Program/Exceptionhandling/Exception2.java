package Exceptionhandling;

import java.util.InputMismatchException;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int c =1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I am a catch block");
			}
		catch(NullPointerException a4)
		{
			System.out.println("I am a catch block");
			}
		catch(InputMismatchException a3)
		{
			System.out.println("I am a catch block");
			}
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("I am a catch block");
			}
		finally
		{
			System.out.println("Im the final block");
		}
	}

}
