package bsj.sec02.exam03;
//Tire 자식클래스
public class KumhoTire extends Tire {
	//필드
	//생성자
	public KumhoTire (String location, int maxRotation) {
		super (location,maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation-accmulatedRotation)+ "회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크***");
			return false;
		}
	}	
}
