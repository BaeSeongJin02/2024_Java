package bsj.sec01.exam07.pack1;
//protected 접근 제한자 테스트

public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}

}
