package bsj.sec02.exam04;

//객체 타입 확인
public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {		//vehicle 매개 변수가 참조하는 객체가 Bus 인지 조사
			Bus bus = (Bus) vehicle;		//Bus 객체일 경우 안전하게 강제 타입 변환
			bus.checkFare();				//Bus 타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}
}
