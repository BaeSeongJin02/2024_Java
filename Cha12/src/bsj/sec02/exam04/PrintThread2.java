package bsj.sec02.exam04;

public class PrintThread2 {

	public static void main(String[] args) {
		// 무한 반복해서 출력하는 스레드
		public void run() {
			while (true) {
				System.out.println("실행 증");
				if (Thread.interrupted()) {
					break;
				}
			}
		System.out.println("자원 종료");
		System.out.println("실행 종료");
		

	}

}
