package bsj.sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// for 문으로 배열 복사
		
		int[] oldIntArray = { 1, 2, 3 };
		int [] newIntArray = new int[5];	//더 큰 배열을 만들고 이전 배열로부터 항목 값들을 복사
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}
	}

}
