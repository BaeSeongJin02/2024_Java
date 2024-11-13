package bsj.sec02.exam03;
//Tire 자식클래스
public class HankookTire extends Tire{
	//필드
	//생성자
	public HankookTire (String location, int maxRotation) {
		super (location,maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation-accmulatedRotation)+ "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크***");
			return false;
		}
	}
}
