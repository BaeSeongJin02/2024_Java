package bsj.sec02.exam04;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		//이항 연산자 - 산술 연산자
		
		int v1 = 5;
		int v2 = 2;
		int result1 = v1 + v2;
			System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;
			System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
			System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;					//소수점 이하 부분을 버리고 출력
			System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;
			System.out.println("result5 = " + result5);
		
		double result6 = (double) v1 / v2;		//double 타입으로 강제 변환하여 소수점 이하 부분 출력 가능
			System.out.println("result6 = " + result6);	
			
			
	}
}
