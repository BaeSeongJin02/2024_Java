package bsj.sec01.exam05;


public class SmartTelevisionExample {

	public static void main(String[] args) {
		// 인터페이스 변수에 구현 객체 대입
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;

	}

}
