package bsj.sec06.exam05.package2;	//패키지가 다름

import bsj.sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;		<- 컴파일 에러 (default 접근 불가)
		//a.field3 = 1;		<- 컴파일 에러 (private 접근 불가)
	
		a.method1();
		//a.method2();		<- 컴파일 에러 (default 접근 불가)
		//a.method3();		<- 컴파일 에러 (private 접근 불가)
	}

}
