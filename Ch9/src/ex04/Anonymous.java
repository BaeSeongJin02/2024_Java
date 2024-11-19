package ex04;

public class Anonymous {
	Person person = new Person() {
		void work() {
			System.out.println("Go to work");
		}
		
		void wake() {
			System.out.println("Wake up at 6");
			work();
		}
	};

}
