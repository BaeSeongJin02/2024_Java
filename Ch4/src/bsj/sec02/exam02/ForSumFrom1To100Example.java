package bsj.sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합을 출력
		
				int sum = 0;		//for 문이 끝내고 사용하기 위해 for문 시작 전 선언
				
				for (int i = 1; i <= 100; i++) {
					sum += i;
				}
				
				System.out.println("1 ~ 100의 합 : " + sum);


	}

}
