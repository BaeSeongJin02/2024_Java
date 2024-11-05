package a9;

public class HiWorld {

	public static void main(String[] args) {
        System.out.println("While 문을 이용한 1부터 100까지의 3의 배수:");
        
        int i = 1; // 초기화
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++; // 증가
        }
        //반복할 횟수가 불확실하거나, 특정 조건이 충족될때까지 반복
	}

}
