package Library;

// controller의 역할
// vo 객체를 이용해서 기능을 수행해주는 역할
public class BookController {
	private Book[] bookList = new Book[100];

	public BookController() {
		super();
	}

	public void insertBook(Book bk) {
		for(int i = 0; i < bookList.length; i++) {
			if(bookList[i] == null) {
				bookList[i] = bk;
				break;
			}
		}
	}
}
