package bsj.sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {	//throw Exception <- System.in.read() 예외 처리코드
		// 입력된 키코드를 변수에 저장
		
		int keyCode;
		
		keyCode = System.in.read();		//시스템이 가지고 있는 입력 장치에서 입력된 키코드를 읽고, 읽은 코드를 변수에 저장
			System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
		

	}

}
