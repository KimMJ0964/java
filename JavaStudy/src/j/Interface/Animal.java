package j.Interface;

import java.awt.image.AbstractMultiResolutionImage;

public interface Animal {
	// static 변수
	// 추상메소드 : 미완성 메서드로 구현부{}가 없는 메소드
	// abstract 추상키워드를 붙여서 생성
	public abstract void move();	// public abstract 생략 가능
	public abstract void eat();
	public abstract void makeSound();
}
