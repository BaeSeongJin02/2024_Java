package ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.SetData(50, 50);
		
		if(car.NeedChangeTire())
			System.out.println("Change Tires");
		else
			System.out.println("Keep Racing");

	}

}
