package bsj.ch06.Main.copy;

public class Main {

	public static void main(String[] args) {
		
		//Car.ShowInfo(); 		Car 공간을 만들고 실행(힙 영역 공백상태)
		
		Car car1 = new Car("현대", "소나타", 100, 0);	//new()메소드로 car 영역 참조
		Car car2 = new Car("벤츠", "S100", 100, 0);
		
		car1.ShowInfo();
		car2.ShowInfo();
		
		
	}

}
