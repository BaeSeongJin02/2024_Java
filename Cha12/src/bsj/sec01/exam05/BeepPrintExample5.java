package bsj.sec01.exam05;

import java.awt.Toolkit;

public class BeepPrintExample5 {
	public static void main(String[] args) {
		// Thread 익명 객체를 이용해서 작업 스레드를 만드는 방법
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i ++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};
		thread.start();
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
