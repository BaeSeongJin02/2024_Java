package bsj.sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		// Getter와 Setter 메소드 사용
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);	//잘못된 속도 변경
			System.out.println("현재 속도 : " + myCar.getSpeed());
			
		myCar.setSpeed(50);	//올바른 속도 변경
		
		if (myCar.isStop()) {	//멈춤
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());

	}

}
