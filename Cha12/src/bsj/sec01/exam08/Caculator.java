package bsj.sec01.exam08;

public class Caculator {
	//동기화 메소드로 수정된 공유 객체
	private int memory;
	
	public int getMemoty() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
