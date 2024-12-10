package bsj.sec01.exam23;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// 기본 타입의 값을 박싱하고 언박싱하기
		//박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
