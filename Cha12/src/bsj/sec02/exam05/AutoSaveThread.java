package bsj.sec02.exam05;

public class AutoSaveThread {
	//1초 주기로 save() 메소드를 호출하는 데몬 스레드
	public void save() {
		System.out.println("작업 내용을 저장할 것");
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		save();
		}
	}

}
