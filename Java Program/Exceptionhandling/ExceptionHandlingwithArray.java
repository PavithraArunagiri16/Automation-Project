package Exceptionhandling;
import java.util.Scanner;

public class ExceptionHandlingwithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            Scanner scanner = new Scanner(System.in);

		        // Define an array of integers
		        int[] numbers = {10, 20, 30, 40, 50};

		        // Prompt user to enter index
		        System.out.print("Enter the index to retrieve the value: ");
		        int index = scanner.nextInt();

		        // Try to access the element at the specified index
		        try {
		            int value = numbers[index];
		            System.out.println("The value at index " + index + " is: " + value);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Error: Index out of bounds. Please enter a valid index.");
		        }
		        
		 
		    }
		}

	


