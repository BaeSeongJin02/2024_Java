package bsj.sec02.exam02;

public class IncreaseDecreaseOperatorExample2 {
	public static void main(String[] args) {
		//증감 연산자 ++, --
		
		int x = 10;
		int y = 10;
		int z;
			System.out.println("-----------------------");
		
		x++;
		++x;
			System.out.println("x = " + x);		
			System.out.println("-----------------------");	
			
		y--;
		--y;
			System.out.println("y = " + y);		
			System.out.println("-----------------------");		
			
		z = x++;		//연산 수행 후에 피연산자의 값을 1증가
			System.out.println("z = " + z);
			System.out.println("x = " + x);
			System.out.println("-----------------------");
			
		z = ++x;		//연산 수행 전에 피연산자의 값을 1증가
			System.out.println("z = " + z);
			System.out.println("x = " + x);
			System.out.println("-----------------------");	
		
		z = ++x + y++;
			System.out.println("z = " + z);
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
	}
}

