package bsj.sec02.exam01;

public class ArrayCreateByValuelistExample1 {

	public static void main(String[] args) {
		// 값 목록으로 배열 생성
		
		int [] scores = {83, 90, 87};

			System.out.println("scores[0] : " + scores[0]);
			System.out.println("scores[1] : " + scores[1]);
			System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
			System.out.println("총합 : " + sum);
			
		double avg = (double)sum / 3;
			System.out.println("평균 : " + avg);

	}

}
