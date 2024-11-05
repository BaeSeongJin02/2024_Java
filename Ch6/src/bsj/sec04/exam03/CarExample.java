package bsj.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		// return 문 실행
		
		Car myCar = new Car();
		
		myCar.setGas(5);	//Car 클래스의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();	//Car 클래스의 isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run(); 			//Car 클래스의 run() 메소드 호출
		}
		
		if (myCar.isLeftGas()) {		//Car 클래스의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
				

	}

}
