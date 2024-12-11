package bsj.sec01.exam07;

public class Calculator {
	//메인 스레드가 실행하는 코드
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
