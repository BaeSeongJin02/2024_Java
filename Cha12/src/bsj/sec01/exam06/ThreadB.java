package bsj.sec01.exam06;

public class ThreadB extends Thread{
	//Thread B 클래스
	
	public void run() {
		for(int i = 0; i < 2; i ++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
