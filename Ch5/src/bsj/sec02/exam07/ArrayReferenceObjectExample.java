package bsj.sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// 객체를 참조하는 배열
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");	//new 연산자로 객체 생성시 새로운 String 객체 생성
		
		System.out.println( strArray[0] == strArray[1] );	//동일한 String 객체 참조
		System.out.println( strArray[0] == strArray[2] );	//== 연산자는 객체의 번지를 비교 false 값 출력
		System.out.println( strArray[0].equals(strArray[2]) );	//equals()메소드는 문자열만 비교 true 값 출력
	}

}
