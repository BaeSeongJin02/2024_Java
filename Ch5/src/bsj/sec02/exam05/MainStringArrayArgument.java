package bsj.sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// main() 메소드의 매개 변수
		
		if (args.length != 2) {		//입력된 데이터 갯수가 2개가 아닐 경우
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); 	//프로그램 강제 종료
		}											//실행할때 매개값을 주지않는 경우 if문 실행
	
			
		String strNum1 = args[0];
		String strNum2 = args[1];		//데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);		//문자열을 정수로 변환
		
		int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
					//Program arguments 입력란에 10 20 매개값을 넣은 후에 출력
			
	}

}
