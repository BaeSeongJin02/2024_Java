package a7;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
      
        
    	int[] numbers = new int[5];
        int sum = 0;
       
        Scanner scanner = new Scanner(System.in);
        
        // 5개의 정수 입력받기
        for (int i = 0; i < 5; i++) {
        	System.out.print((i+1) + "번째 정수를 입력하세요 : ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // 입력된 숫자를 바로 합계에 더함
        }
        
        // 평균 계산
        double average = (double)sum / numbers.length;
        
        // 결과 출력
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        
        // 스캐너 닫기
        scanner.close();
    }
}

