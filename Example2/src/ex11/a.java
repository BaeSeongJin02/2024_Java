package ex11;

public class CatchExample {

    public static void main(String[] args) {
        try {
            // 강제로 ArrayIndexOutOfBoundsException 발생
            int[] arr = new int[3];
            int value = arr[5]; // 배열 인덱스 초과

            // 강제로 다른 예외 발생
            int result = 10 / 0; // ArithmeticException
        } 
        // 하위 예외 클래스가 먼저 와야 함
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 초과 예외 처리");
        } 
        catch (ArithmeticException e) {
            System.out.println("산술 예외 처리");
        } 
        // 상위 예외 클래스는 마지막에 위치
        catch (Exception e) {
            System.out.println("그 외 예외 처리");
        }
    }
}
