package bsj.sec01.exam03;

public class A {
	//멤버 클래스에서 사용제한
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;	//모든 필드와 메소드에 접근할 수 있음
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;		인스턴스 필드와 메소드는 접근할 수 없음
			//method1();
			
			field2 = 10;		
			method2();
		}
	}
}
