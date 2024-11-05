package bsj.sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		//char 타입 산술 연산
		
		char c1 = 'A' + 1;	//char c1 = bb; 으로 컴파일됨
		char c2 = 'A';
		//char c3 = c2 + 1; <-컴파일 에러 (산술연산 과정에서 int 타입으로 변환되므로 연산 결과는 int 타입)
			System.out.println("c1 : " + c1);
			System.out.println("c2 : " + c2);
		//System.out.println("c3 : " + c3);
			
	}
}
