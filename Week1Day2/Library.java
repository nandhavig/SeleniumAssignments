package Week1Day2;

public class Library {

	public static void main(String[] args) {
		
		Library text1 = new Library();
		text1.aaddBook(null);
		text1.issueBook();
		

	}
	public String aaddBook(String bookTitle) {
		
		System.out.println("books added sucessfully");
		
		return bookTitle;
		
	}
	
	public void issueBook() {
		
		System.out.println("books Issued sucessfully");
		
		
	}

}
