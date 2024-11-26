package ex06;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 1;
		
		field = 10;
		
		//arg1 = 10;	final로 선언했기 때문
		//arg2 = 20;	result 값에 넣을 때 오류
	
		//var1 = 10;	final로 선언했기 때문
		//var2 = 20;	result 값에 넣을 때 오류
		
		Calculatable calc = new Calculatable() {
			public int sum() {
				int result = 0;
				result = arg1 + arg2 + var1 + var2;
				return result;
			}
		};
	}

}
