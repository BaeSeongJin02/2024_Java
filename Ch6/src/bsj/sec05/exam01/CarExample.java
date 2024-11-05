package bsj.sec05.exam01;

public class CarExample {

	public static void main(String[] args) {
		// 인스턴스 멤버와 this 실행
		
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();

	}

}
