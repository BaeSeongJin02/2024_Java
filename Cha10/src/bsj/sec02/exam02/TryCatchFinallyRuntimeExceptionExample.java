package bsj.sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		// 실행 예외 처리
		
		String data1 = null;
		String data2= null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값이 수가 부족합니다.");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch(NumberFormatException e) {
			System.out.println("다시 실행하세요.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
