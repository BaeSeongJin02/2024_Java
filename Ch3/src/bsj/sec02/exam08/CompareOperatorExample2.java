package bsj.sec02.exam08;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		//비교 연산자
		
		int v2 = 1;
		double v3 = 1.0;
			System.out.println(v2 == v3); 	//true
		
		double v4 = 0.1;
		float v5 = 0.1f;
			System.out.println(v4 == v5); 	//false		(0.1f는 0.1의 근사값이되어 0.1보다 큰 값이됨)
			System.out.println((float)v4 == v5);	//true	(float 타입으로 변환)
			System.out.println((int)(v4 * 10) == (int)(v5 * 10)); 	//true	(정수타입으로 변환 이후 비교)
			
	}
}

