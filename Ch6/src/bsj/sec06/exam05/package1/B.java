package bsj.sec06.exam05.package1;	//패키지 동일

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;		<- 컴파일 에러 (private 접근 불가)
	
		a.method1();
		a.method2();
		//a.method3();		<- 컴파일 에러 (private 접근 불가)
	}
}
