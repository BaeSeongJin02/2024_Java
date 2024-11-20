package bsj.sec02.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// 매개 변수의 다형성 테스트
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);		//자동 타입 변환
		driver.drive(taxi);		//자동 타입 변환
	}

}
