package bsj.ch06.Main.copy;

public class Car {
	//Car 클래스 선언
	
	
	String company;
	String model;
	
	int maxSpeed = 100;
	int speed = 0;
	
	Car(String com, String mo, int max, int sp) {
		company = com;
		model = mo;
		maxSpeed = max;
		speed = sp;
	}
	
	void ShowInfo() {
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
		System.out.println("MaxSpeed : " + maxSpeed);
		System.out.println("Speed : " + speed);
		
	}

}
