package bsj.sec01.exam25;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		// 문자열을 기본 타입 값으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value : " + value1);
		System.out.println("value : " + value2);
		System.out.println("value : " + value3);
	}
}
