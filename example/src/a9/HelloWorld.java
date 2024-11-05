package a9;

public class HelloWorld {

	public static void main(String[] args) {
		   
		System.out.println("For 문을 이용한 1부터 100까지의 3의 배수:");
		        
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
		    }
		}

		//반복할 횟수가 정해져 있을때 사용
	}

}
