package bsj.sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// 객체 생성 후 필드값 출력
		
		Korean k1 = new Korean("배성진", "011225-1234567");
			System.out.println("k1.name : " + k1.name);
			System.out.println("k1.ssn : " + k1.ssn);
			
			
		Korean k2 = new Korean("배자바", "930525-0654321");
			System.out.println("k1.name : " + k2.name);
			System.out.println("k1.ssn : " + k2.ssn);
			

	}

}
