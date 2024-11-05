package bsj.sec03.exam04;

public class Car {
	// 다른 생성자를 호출해서 중복코드 줄이기
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	//생성자
	Car (){
	}
	
	Car (String model) {
		this(model, "은색", 250);
	}
	
	Car (String model, String color) {
		this(model, color, 250);
	}
	
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;	//공통 실행코드
	}
	
}
