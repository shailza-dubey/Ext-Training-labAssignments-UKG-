package q2;

public class BookStore {
	Book[] books = new Book[10];
	
	
	
	public void add() {
		
	}
	
	public void sell(String bookTitle, int noOfCopies) {
		for(int i=0;i<books.length;i++) {
			if(books[i].getBookTitle() == bookTitle) {
				int currNoOfCopies = books[i].getNumOfCopies() - noOfCopies;
				books[i].setNumOfCopies(currNoOfCopies);
				
			}
			else
			{
				System.out.println("This book doesn't exist in the Bookstore");
			}
		}
	}
	public void order(String isbn, int noOfCopies) throws Exception {
		for(int i=0; i<books.length; i++) {
			
			if(books[i].getISBN()==isbn && books[i].getISBN()!=null) {
				int currNoOfCopies = books[i].getNumOfCopies() + noOfCopies;
				books[i].setNumOfCopies(currNoOfCopies);
				
			}
			else {
				Book newBook = new Book(null,null,isbn,noOfCopies);
				books[books.length+1]=newBook;
				
			}
		}
	}
	
	public void display() {
		// TODO Auto-generated meth,od stub
		for(int i=0;i<books.length;i++) {
			books[i].display();
		}
		
	}

}
