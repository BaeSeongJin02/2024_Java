package c3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 15;
		int v2 = 0;	//추가해서 해결
		
		if(v1 > 10) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
		
		//v2 는 if 문 안에서만 쓰이는 지역변수

	}

}
