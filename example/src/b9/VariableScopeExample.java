package b9;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 77p 2장 sec01.exam04

		int v1 = 15;
		int v2 = 0;    //v2 선언만 되고 값이 초기화되지 않아 오류 -> int v2 = 0;
		
		if (v1 > 10) {
			v2 = v1 - 10;
		}
		
		System.out.println(v2);
		
	}
	
	

}
