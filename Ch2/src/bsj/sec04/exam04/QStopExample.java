package bsj.sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		// q 를 입력하면 반복 종료
		
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
				System.out.println("KeyCode : " + keyCode);
			if (keyCode == 113) {
				break;			//keyCod 값이 113일 경우 while 반복을 중지함
			}
		}

		System.out.println("종료");
	}

}
