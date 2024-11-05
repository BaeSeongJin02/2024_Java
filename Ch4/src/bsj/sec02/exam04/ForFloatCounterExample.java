package bsj.sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// float 타입 카운터 변수
		
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}

		//0.1은 float 타입으로 정확하게 표현 불가능 -> x에 0.1보다 약간 큰값 더함 -> 루프는 9번

	}

}
