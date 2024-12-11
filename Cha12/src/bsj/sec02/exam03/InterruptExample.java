package bsj.sec02.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		// 1초 후 출력 스레드를 중지

		Thread thread = new PrintThead2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		thread.interrupt();
	}

}
