package bsj.sec03.exam01.exam02;
//추상 메소드 재정의 - 강아지
public class Dog extends Animal {

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
