package bsj.sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// break 없는 case
		
		int time = (int) (Math.random() * 4) + 8;	//8 ~ 11 사이의 정수 뽑기
		System.out.println("[현재시간 : " + time + "시]");
		
		switch(time) {
		
		case 8:
			System.out.println("출근합니다.");		//break가 없어 case9도 실행 후 다음 case 실행
		
		case 9:
			System.out.println("회의를 합니다");		//break가 없어 case10도 실행 후 다음 case 실행
			
		case 10:
			System.out.println("업무를 봅니다.");		//break가 없어 default도 실행
			
		default:
			System.out.println("외근을 나갑니다.");
			
		}
		
	}

}
