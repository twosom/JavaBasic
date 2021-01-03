package object;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	
	//toString() 메서드를 직접 재정의하면 객체의 참조 변수를 이용해
	//원하는 문자열을 포함할 수 있음.
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}


public class ToStringEx {
	public static void main(String [] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		System.out.println(book1.hashCode());
		
	}
}
