package q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQues {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				try {
					System.out.println("Please enter a number or enter '-1' to quit the program");
					
					int number = sc.nextInt();
					if(number==-1)
						break;
					else if(number%2 != 0)
						System.out.println("You have entered an odd number");
					else
						System.out.println("You have entered an even number");

				} catch (InputMismatchException e) {
					System.out.println("You must enter an Integer");
					sc.next();
				}
			}

		}
   }

}
