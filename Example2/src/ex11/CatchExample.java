package ex11;
//다중 catch 블록을 작성할 때 주의할 점은 상위 예외 클래스가 
//하위 예외 클래스보다 아래쪽에 위치해야 한다는 것이다.

//그 이유를 서술하라 
상위 예외 클래스가 하위 예외 클래스보다 위에 위치하면, 상위 예외 클래스가 하위 예외를 포함하기 때문에 하위 예외에 대한 블록이 실행될 기회가 없게 됩니다.
//또한 다음은 잘못된 코딩의 예이다.
//이를 올바르게 수정하라.

public class CatchExample {

	public static void main(String[] args) {
		try {
			ArrayIndexOutOfBoundsException 발생
			
			다른 Exception 발생
		} catch(Exception e) {
			예외 처리 1
			
		} catch (Exception e) {
			예외 처리 2
			
		}

	}

}
