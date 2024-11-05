package bsj.sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		// final 필드 테스트
		//final 필드 : 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없다.
		//필드 선언 시에 주거나 생성자에서 주는 방법 뿐.
		
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.print(p1.nation);
		System.out.print(p1.ssn);
		System.out.print(p1.name);
		
		//p1.nation = "usa";	final 필드로 선언되었음. 수정 불가
		//p1.ssn = "654321-7654321";
		p1.name = "홍삼원";

	}

}
