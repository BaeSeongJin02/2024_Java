package bsj.sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		// 	바깥쪽 반복문 종료
		
		Outter : for (char upper = 'A'; upper <= 'z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;		//break + 바깥쪽 반복문의 이름(Outter)
				}
			}
		}

		System.out.println("프로그램 실행 종료");
		
		}

}
