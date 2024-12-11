package bsj.sec01.exam07;

public class MainThreadExample {

	public static void main(String[] args) {
		// 메인 스레드가 실행하는 코드
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
