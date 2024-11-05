package bsj.sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		// continue 를 사용한 for 문
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			
			System.out.println(i);
		}


	}
}
