package bsj.sec02.exam03;
//Tire 를 부품으로 가지는 클래스

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞 왼쪽", 6);
	Tire frontRightTire = new Tire("앞 오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire backRightTire = new Tire("뒤 오른쪽", 4);
	
	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) { stop(); return 1;}
		if (frontRightTire.roll() == false) { stop(); return 2;}
		if (backLeftTire.roll() == false) { stop(); return 3;}
		if (backRightTire.roll() == false) { stop(); return 4;}
		return 0;		// 모든 타이어가 정상적으로 구를 경우 0을 반환
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
