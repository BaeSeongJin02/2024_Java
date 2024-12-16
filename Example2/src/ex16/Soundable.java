package ex16;

public interface Soundable {
	 String sound();
}

//SoundableExample 클래스에서 printSound() 메소드는 Soundable 인터페이스 타입의 매개 변수를 가지고 있다. 
//main() 메소드에서 printSound()를 호출할 때 Cat과 Dog객체를 주고 실행하면 각각 "야옹"과 "멍멍"이 출력되도록 
//Cat과 Dog클래스를 작성하고,거기에서 implements 키워드가 사용되어야 하는 이유에 대해 간략한 설명을 하시오.
