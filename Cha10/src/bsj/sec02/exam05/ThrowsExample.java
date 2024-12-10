package bsj.sec02.exam05;

public class ThrowsExample {

	public static void main(String[] args) {
		// 예외 처리 떠넘기기
		
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} 
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
