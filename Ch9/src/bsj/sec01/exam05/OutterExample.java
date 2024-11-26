package bsj.sec01.exam05;

public class OutterExample {

	public static void main(String[] args) {
		// 실행 클래스
		
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();

	}

}
