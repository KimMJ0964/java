package test.t240709.object4;

public class Run {
	public static void main(String[] args) {
		Book book01 = new Book();
		Book book02 = new Book("초보자를 위한 리액트React 200제", "정보문화사", "이정열");
		Book book03 = new Book("한 권으로 끝내는 웹 기본 교과서 HTML + CSS + 자바스크립트 웹 표준의 정석",
				"이지스 퍼블리싱", "고경희", 26000, 15.5);
		
		book01.inform();
		book02.inform();
		book03.inform();
	}
}
