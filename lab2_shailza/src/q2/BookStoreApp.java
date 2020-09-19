package q2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		BookStore bs = new BookStore();
		
		
		int choice=0;
		do {
			
			System.out.println(" Main Menu ");
			System.out.println(" 1 - Display all ");
			System.out.println(" 2 - Order books ");
			System.out.println(" 3 - Sell books ");
			System.out.println(" 4 - Exit ");
			int noOfCopies=0;
			String isbn,bookTitle,c;
			
			System.out.println("Enter your choice!");
			Scanner sc = new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice) {
			case 1 : bs.display();
			         break;
			case 2 : a:{System.out.println("Enter the book title and no of copies you want to order");
			         isbn=sc.next();
			         noOfCopies=sc.nextInt();
			         try {
						bs.order(isbn,noOfCopies);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			         System.out.println("Do you want to order again? Y/N");
			         c=sc.next();
			         if(c=="y"||c=="Y")
			        	 break a;
			         }
			         
			         break;
			case 3 : b:{System.out.println("Enter the book title and no of copies you want to order");
	                     bookTitle=sc.next();
	                     noOfCopies=sc.nextInt();
	                     bs.sell(bookTitle,noOfCopies);
	                     System.out.println("Do you want to sell again? Y/N");
	                     c=sc.next();
	                     if(c=="y"||c=="Y")
	                    	 break b;}
	                     
	                     break;
			 case 4 :  break;
			
		}
		

	}while(true);

}
}
