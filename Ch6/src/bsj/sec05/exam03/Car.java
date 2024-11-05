package bsj.sec05.exam03;

public class Car {
	
	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	//정적 메소드
	public static void main(String[] args) {
		//this.speed = 20;  	<- 컴파일 에러			객체가 없어도 실행됨
		//this.run();			<- 컴파일 에러			내부에 인스턴스 필드나 인스턴스 메소드, 그리고 this 키워드 사용 불가
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
