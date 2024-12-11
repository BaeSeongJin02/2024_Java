package bsj.sec02.exam05;

public class DamonExample {

	public static void main(String[] args) {
		// 메인 스레드가 실행하는 코드
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");

	}

}
