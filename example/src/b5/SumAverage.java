package b5;

public class SumAverage {

	public static void main(String[] args) {
		//
		
		int [][] array = {
				{90, 85, 95, 88}, //A학생의 점수
				{78, 82, 91, 85}, //B학생의 점수
				{88, 90, 77, 84}, //B학생의 점수
				{95, 94, 89, 92} //D학생의 점수
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		
		
		//배열의 요소 개수
		int totalElements = array.length * array[0].length;
		
		avg = (double) sum / totalElements;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		

	}

}
