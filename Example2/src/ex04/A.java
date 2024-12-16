package ex04;

public class A{
	//435p 9장 sec01.exam03
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}

	class B {
		void method() {
			field1 = 10;	//(1)
			method1();		//(2)
	
			field2 = 10;	//(3)
			method2();		//(4)
		}
	}
	static class C {
		void method() {
			//field1 = 10;		//(5)
			//method1();		//(6)
			field2 = 10;		//(7)
			method2();			//(8)
		}
	}
}

//1,2,3,4 모든 필드와 메소드에 접근가능
//7,8 정적 필드와 메소드는 정적 내부 클래스 C에서 접근 가능
//5,6 정적 내부 클래스 C는 외부 클래스의 인스턴스 필드, 메소드 접근 불가능

