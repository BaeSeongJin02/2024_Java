package example;

public class example {

	public static void main(String[] args) {

		float x;	
		float y = 0.1f;
		
		for (x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		
		if (x -0.1f == y) {
			System.out.println("x 와 y는 같음" + x);
		} else {
			System.out.println("x와 y는 다름" + x);

		}

	}

}
