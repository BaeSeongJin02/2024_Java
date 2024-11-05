package a5;

public class Example01 {

	public static void main(String[] args) {

		int i;
		int sum = 0;
		
		for (i =1; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}

}
