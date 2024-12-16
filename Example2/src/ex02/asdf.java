
다음 코드의 결과값이 Truck Speed : 80.0 Speed : 80.0 일때 hiding의 개념을 통해 설명하시오. 
public class Main {
    public static void main(String[] args) {
    	Truck truck = new Truck (80);
		truck.ShowSpeed();
		System.out.println("Speed : " + truck.speed);
    }
}
public class Car {
    public int speed;
	
	Car (int speed) {
		this.speed = speed;
	}
	
	public void showSpeed() {
		System.out.println("Car Speed : " + speed);
	}
}
public class Truck extends Car {
	public double speed;
	
	Truck (double speed) {
		super(10); 		
		this.speed = speed;
	}
	
	public void ShowSpeed() {
		System.out.println("Truck Speed : " + speed);
	}
}