package bsj.sec01.exam20;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		// 전부 소문자 또는 대문자로 변경
		String str1 = "JAVA Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
