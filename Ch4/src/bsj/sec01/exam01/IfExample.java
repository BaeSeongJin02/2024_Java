package bsj.sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		// if문
		
		int score = 93;
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if (score < 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");		//중괄호 블록이 없어 이라인은 if문과 상관없는 실행문임
		
	}

}
