package ex17;

public class ExceptionTest {

	public static void main(String[] args) {
		// 480p 
	 try {
	    String str = null;
	    System.out.println(str.length());
	} catch (NullPointerException e) {
	    System.out.println("NullPointerException 발생");
		}
	} catch (Exception e) {
	    System.out.println("Exception 발생");
	}
}

//아래 main 메소드에 들어갈 코드를 <보기>에서 순서대로 배열하여,
//정상적으로 예외 처리를 수행하도록 하여라.

//[1] catch (Exception e) {
//    System.out.println("Exception 발생");
//}
//[2] try {
//    String str = null;
//    System.out.println(str.length());
//}
//[3] catch (NullPointerException e) { //
//    System.out.println("NullPointerException 발생");
//}
