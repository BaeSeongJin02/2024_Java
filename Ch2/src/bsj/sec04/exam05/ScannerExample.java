package bsj.sec04.exam05;

import java.util.Scanner;		//Scanner 가 java.util 패키지에 있다는 것을 컴파일러에게 알려줌

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// 키보드에서 입력된 내용을 문자열로 얻기
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
				System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");

	}

}
