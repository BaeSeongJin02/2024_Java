package bsj.sec02.exam03;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		//논리 부정 연산자 ! (boolean 타입에만 사용)
		
		boolean play = true;
			System.out.println(play);

		play = !play;	//피연산자가 true 면 false 출력
			System.out.println(play);

		play = !play;	//피연산자가 false 면 true 출력
			System.out.println(play);
			
	}
}
