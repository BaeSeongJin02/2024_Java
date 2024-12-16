package ex06;

public class SoundTest {

    public static void main(String[] args) {
        Thread soundThread = new SoundThread();
        soundThread.start();

        for(int i=0; i<5; i++) {
            System.out.println("삡");
            try { 
                Thread.sleep(500); 
            } catch(Exception e) {}
        }
    }
}
//1. 위 코드를 실행했을 때 실행 결과를 예측하고, 각 클래스가 어떤 작업을 실행하는지 설명하시오.
//삡 출력과 비프음이 0.5초 간격으로 실행
//SoundThread 클래스:
//비프음을 출력한 뒤 0.5초 대기한 후 다시 5번 반복 
//
//SoundTest 클래스:
//"삡"을 출력하고 0.5초 대기한 후 다시 실행 5번 반복
////2. 위 코드에서 Thread.sleep(500)을 Thread.sleep(1000)으로 변경한다면 동작에 어떤 변화가 생기는지 설명하시오.
//실행속도가 느려지고, 0.5초 대기가 1초 대기로 바뀐다.
