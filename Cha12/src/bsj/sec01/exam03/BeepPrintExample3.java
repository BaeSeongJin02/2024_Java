package bsj.sec01.exam03;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// Runnable 익명 구현 객체로 대체
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i ++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});
		thread.start();
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
