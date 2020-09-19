package q2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		BookStore bs = new BookStore();
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.println(" Main Menu ");
			System.out.println(" 1 - Display all ");
			System.out.println(" 2 - Order books ");
			System.out.println(" 3 - Sell books ");
			System.out.println(" 0 - Exit ");
			System.out.println("Enter your choice!");
			
			int choice=sc.nextInt();
			
			
			switch(choice) {
			case 1 : bs.display();
			         break;
			         
			case 2 : System.out.print("Enter the book isbn: ");
			         sc.nextLine();
			         String isbn=sc.nextLine();
			         System.out.print("Enter the no of copies you want to order: ");
			         int noOfCopiesOrder=sc.nextInt();
			         bs.order(isbn,noOfCopiesOrder);
			         break;

			         
			  
			case 3 : System.out.print("Enter the book title: ");
			         sc.nextLine();
				 String bookTitle=sc.nextLine();
				 System.out.print("Enter the no of copies you want to sell: ");
				 int noOfCopiesSell=sc.nextInt();
				 bs.sell(bookTitle,noOfCopiesSell);
				 break;

	                 
	                    	 
	               case 0 : break;
			
		}
		

	}while(true);
    
   }
}

