package a6;

public class JavaExam {

	public static void main(String[] args) {
		// 195p 5장sec01.exam01
		
		String hobby1 = "테니스";
		String hobby2 = "테니스";

		if (hobby1 != hobby2) {
			System.out.println("hobby1 과 hobby2는 참조가 다름");
		} else {
			System.out.println("hobby1 과 hobby2는 참조가 같음");
		}
		
		if (hobby1.equals(hobby2)) {
			System.out.println("hobby1 과 hobby2는 문자열이 같음");
		} 
		
		String hobby3 = new String("테니스");
		String hobby4 = new String("테니스");

		if(hobby3 == hobby4) {
			System.out.println("hobby3 과 hobby4는 참조가 같음");
		}	else {
			System.out.println("hobby3 과 hobby4는 참조가 다름");
		}
		
		if (hobby3.equals(hobby4)) {
			System.out.println("hobby3 과 hobby4는 문자열이 같음");
		}
	}

}
