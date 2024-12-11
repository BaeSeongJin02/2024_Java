package bsj.sec02.exam03;

public class PrintThread2 extends Thread {
	//1초 후 출력 스레드를 중지
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}
	
	System.out.println("자원 정리");
	System.out.println("실행 종료");
	
	}
}
