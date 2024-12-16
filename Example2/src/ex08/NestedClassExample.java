package ex08;

public class NestedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//작성위치1	
        Car.Tire tire = myCar.new Tire();
        //작성위치2
        Car.Engine engine = new Car.Engine();
	}

}
