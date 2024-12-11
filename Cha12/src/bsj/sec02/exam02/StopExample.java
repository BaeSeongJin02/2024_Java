package bsj.sec02.exam02;

public class StopExample {

	public static void main(String[] args) {
		// 1초 후 출력 스레드를 중지
		
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		printThread.setStop(true);

	}

}
