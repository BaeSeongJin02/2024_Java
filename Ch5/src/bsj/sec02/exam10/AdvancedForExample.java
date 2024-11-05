package bsj.sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// 향상된 for 문
		//반복 실행을 하기 위해 루프 카운터 변수와 증감식 사용 X
		//배열 및 컬렉션 항목의 개수만큼 반복후, 자동적으로 for 문 종료
		
		
		int [] scores = { 95, 71, 84, 93, 87 };
	
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
			System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
			System.out.println("점수 평균 = " + avg);
		

	}

}
