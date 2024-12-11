package bsj.sec01.exam07;

public class User2 extends Thread {
	//User2 스레드
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");			//스레드 이름을 User1로 설정
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(50);
	}

}
