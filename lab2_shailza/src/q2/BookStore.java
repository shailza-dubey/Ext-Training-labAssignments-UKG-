package q2;

import java.util.Arrays;
import java.util.Scanner;

class BookStore {
	private Book[] books = new Book[10];
	
	public void sell(String bookTitle, int noOfCopies) {
		Book currBook=null;
		for(Book book : books) {
			if(book!=null && book.getBookTitle().equals(bookTitle)) {
				currBook=book;
				break;
			}
		}
		if(currBook!=null) {
				currBook.setNumOfCopies((currBook.getNumOfCopies()-noOfCopies));
		}else {
				System.out.println("Book is not found in the bookstore");
		}
		
	}
	public void order(String isbn, int noOfCopies){
		for(Book book : books) {
			
			if(book!=null && book.getISBN().equals(isbn)) {
				book.setNumOfCopies(book.getNumOfCopies() + noOfCopies);
				break;
				
			}
			else if(book==null) {
				Scanner sc = new Scanner(System.in);
				System.out.println("No such book is found");
				System.out.print("Enter book's title: ");
				String bookTitle=sc.nextLine();
				System.out.print("Enter book's author: ");
				String author=sc.nextLine();
				books[Arrays.asList(books).indexOf(book)]=new Book(author,bookTitle,isbn,noOfCopies);
				break;
				
			}
		}
	}
	
	public void display() {
		System.out.println("Details of all books: ");
		for(Book book : books) {
			if(book!=null)
				book.display();
		}
		
	}

}
