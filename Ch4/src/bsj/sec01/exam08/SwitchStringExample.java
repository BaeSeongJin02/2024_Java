package bsj.sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		// String 타입의 Switch 문
		
		String position = "과장";
		
		switch (position) {
		
		case "부장" :
			System.out.println("700만원");
			break;
			
		case "과장" :
			System.out.println("500만원");
			break;
			
		default :
			System.out.println("300만원");
			break;
			
		}

	}

}
