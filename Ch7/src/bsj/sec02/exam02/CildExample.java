package bsj.sec02.exam02;

public class CildExample {

	public static void main(String[] args) {
		// 자동 타입 변환 후의 멤버 접근
		Child child = new Child();
		
		Parent parent = child;		//자동 타입 변환
		parent.method1();
		parent.method2();			//재정의된 메소드가 호출됨
		//parent.method3();  	<- 컴파일 에러

	}

}
