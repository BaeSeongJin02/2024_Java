package bsj.sec01.exam02;

public class IfElseExample {

	public static void main(String[] args) {
		// if - else문
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {								//score < 90 인 경우
				System.out.println("점수가 90보다 작습니다.");
				System.out.println("등급은 B입니다.");
		}

		
	}
}
