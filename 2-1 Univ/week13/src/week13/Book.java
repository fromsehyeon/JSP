package week13;

public class Book  implements Lendable{
	
	String bookNo;
	String title;
	String writer;
	String person;
	String checkDate;
	byte state;
	
	public Book(String bookNo, String title, String writer) {
		this.bookNo = bookNo;
		this.title = title;
		this.writer = writer;
	}

}
