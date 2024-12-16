package ex02;

public class Main {
    public static void main(String[] args) {
    	Truck truck = new Truck (80);
		truck.ShowSpeed();
		System.out.println("Speed : " + truck.speed);
    }
}

// 하이딩은 부모 클래스의 필드가 자식 클래스에서 동일한 이름으로 재정의될 때 발생하는 현상으로 
// truck.speed에서 자식 클래스의 Truck 클래스의 speed를 참조하므로 Speed : 80.0을 출력