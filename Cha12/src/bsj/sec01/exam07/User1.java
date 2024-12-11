package bsj.sec01.exam07;

public class User1 extends Thread {
	//User1 스레드
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");			//스레드 이름을 User1로 설정
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(100);
	}
}
