package bsj.sec02.exam01;

public class SleepExample {

	public static void main(String[] args) {
		// 3초 주기로 10번 비프음 발생
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i ++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
		}

	}

}
