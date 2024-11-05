package bsj.sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 중첩 for 문을 사용한 구구단 출력
		
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n ++) {				//중첩 for 문
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}

	}

}
