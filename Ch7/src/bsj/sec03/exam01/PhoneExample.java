package bsj.sec03.exam01;
//실행 클래스
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("배성진");
		
		smartPhone.turnOn();			//Phone 메소드
		smartPhone.internetSearch();	//SmartPhone 메소드
		smartPhone.turnOff();			//Phone 메소드

	}

}
