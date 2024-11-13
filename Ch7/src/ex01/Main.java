package ex01;

public class Main {

	public static void main(String[] args) {
		
		//Car car = new Car (100);
		//System.out.println("Speed : " + speed);  		부모로부터 물려받은 speed()와 speed() 메소드가 동일해서 컴파일에러
		
		Truck truck = new Truck (80);
		truck.ShowSpeed();
		System.out.println("Speed : " + truck.speed);	//hiding 개념 (부모의 속성을 숨김)
		
		Car car = truck;
		car.showSpeed();
		System.out.println("Speed : " + car.speed);		//오버라이딩 : 부모로 실행시켜도 자식을 실행함 Truck() 실행

	}

}
