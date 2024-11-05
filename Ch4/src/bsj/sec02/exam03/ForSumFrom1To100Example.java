package bsj.sec02.exam03;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// 1 부터 100까지 합을 출력
		
		int sum = 0;	//합계 변수
				
		int i = 0;		//루프 카운터 변수
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
				
		System.out.println("1 ~ " + (i-1) + "합 : " + sum);


	}

}
