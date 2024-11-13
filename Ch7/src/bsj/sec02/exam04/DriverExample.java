package bsj.sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		// 실행 클래스
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi); 

	}

}
