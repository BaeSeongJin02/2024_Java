package bsj.sec01.exam19;

public class StringSubStringExample {

	public static void main(String[] args) {
		// 문자열 추출하기
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
