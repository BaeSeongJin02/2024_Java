package bsj.sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// 메인 스레드만 이용한 경우
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i =0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}	//0.5 초간 정지
		}
	}

}