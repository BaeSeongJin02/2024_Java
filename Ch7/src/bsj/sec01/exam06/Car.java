package bsj.sec01.exam06;
//부모 클래스

public class Car {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() { speed += 1; }
	
	//final 메소드
	public final void stop () {
		System.out.println("차를 멈춤");
		speed = 0;
	}						//메소드 선언시 final 키워드를 붙이면 이 메소드는 최종적인 메소드
							//자식 클래스에서 재정의 불가능

}
