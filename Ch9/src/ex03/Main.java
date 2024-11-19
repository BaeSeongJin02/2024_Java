package ex03;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
		Parent parent = new Child();
//		parent.age = 20;		child 가 보이지않기에 parent 안에는 age 가 없음
		
//		Parent parent = new Parent() {
//			int age = 10;
//			public void ShowInfo() {
//				System.out.println("My name is : " + name);
//				System.out.println("My age is : " + age);
//			}
//		};		
//		m.Check(parent);	

		
//		m.Check(new Parent());		//Parent 를 한번만 사용했을 떈, 더 깔끔한 코드
		
		
		m.Check(					//실제 일상 코드는 다음과 같이 사용한다.
				new Parent() {
					int age = 10;
					public void ShowInfo() {
						System.out.println("My name is : " + name);
						System.out.println("My age is : " + age);
					}
				}		
			);
	}

	
	void Check(Parent parent) {
		parent.ShowInfo();
	}

}
