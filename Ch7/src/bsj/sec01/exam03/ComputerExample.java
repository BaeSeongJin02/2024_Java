package bsj.sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		//메소드 재정의 테스트
		
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + calculator.areaCircle(r));	//재정의 된 메소드

	}

}
