package q6;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputException extends RuntimeException{


	public InputException(int max) {
		super("Number can't be greater than " + max);
		
	}
     
}

public class CustomInputException {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter max value of integer that can be taken: ");
			int max_val = sc.nextInt();
			while(true) {
				try {
					System.out.println("Please enter a number or enter '-1' to quit the program");
					
					int number = sc.nextInt();
					if(number==-1)
						break;
					else if(number>100)
						throw new InputException(max_val);
					else if(number%2 != 0)
						System.out.println("You have entered an odd number");
					else
						System.out.println("You have entered an even number");

				} catch (InputMismatchException e) {
					System.out.println("You must enter an Integer");
					sc.next();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		}
   }

}


