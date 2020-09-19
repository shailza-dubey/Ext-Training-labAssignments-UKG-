package q2;

public class Book {
	private String bookTitle="null";
	private String author="null";
	private String ISBN="null";
	private int numOfCopies=0;
	public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
	
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
		
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void display() {
		System.out.println(bookTitle + " - " + author + " - " + ISBN+ " - " + numOfCopies );
	}

}
