package bsj.sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// 필드 다형성 테스트
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		myCar.run();
	}

}
