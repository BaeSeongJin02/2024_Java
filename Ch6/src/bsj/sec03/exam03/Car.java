package bsj.sec03.exam03;

public class Car {
	//생성자 오버로딩
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 1
	Car(){
	}
	
	//생성자 2
	Car(String model) {
		this.model = model;
	}
	
	//생성자 3
	Car (String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//생성자 4
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
