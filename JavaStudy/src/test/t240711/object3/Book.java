package test.t240711.object3;

public class Book {
	private String title;
	private String genre;
	private String author;
	private int no;
	
	public Book(String title, String genre, String author, int no) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.no = no;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public String toString() {
		return " ** 도서 정보 출력 ** \n도서 [제목=" + title + ", 장르=" + genre + ", 저자=" + author + ", 번호=" + no + "]";
	}
	
	
}
