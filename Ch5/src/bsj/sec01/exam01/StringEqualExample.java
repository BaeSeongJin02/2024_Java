package bsj.sec01.exam01;

public class StringEqualExample {

	public static void main(String[] args) {
		// 문자열 비교
		
		String strVar1 = "배성진";
		String strVar2 = "배성진";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}	else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		
		String strVar3 = new String("배정인");
		String strVar4 = new String("배정인");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}	else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		//new 연산자로 String 객체를 별도로 생성했기에 strVar3 == strVar4는 false 출력
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		//equals() 메소드를 활용하여 원본 문자열과 매개값으로 주어진 비교 문자열리 동일한지 판단
	}

}
