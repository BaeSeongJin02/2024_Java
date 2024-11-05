package a4;

public class Calculator {
	//272p sec04.exam01;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	
	
	double divide(int x, int y) {
		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		return 0;
		} else {
		double result = (double)x/ (double)y;
		return result;
		}
	}

	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
