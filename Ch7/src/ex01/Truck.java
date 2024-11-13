package ex01;

public class Truck extends Car{
	public double speed;
	
	Truck (double speed) {
		super(10); 	//Car() 과 동일 부모와 동일
		this.speed = speed;
	}
	
	public void ShowSpeed() {
		System.out.println("Truck Speed : " + speed);
	}
}
