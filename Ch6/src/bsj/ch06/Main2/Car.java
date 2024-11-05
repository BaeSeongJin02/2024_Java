package bsj.ch06.Main2;

public class Car {
	
	String company;
	String model;
	
	int maxSpeed = 100;
	int speed = 0;
	
	Car(String company, String model, int maxSpeed, int speed) {
		
		this.company = company;		//this.사용 
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	void ShowInfo() {
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
		System.out.println("MaxSpeed : " + maxSpeed);
		System.out.println("Speed : " + speed);
		
	}

}
