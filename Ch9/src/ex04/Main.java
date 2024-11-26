package ex04;

public class Main {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		//anony.person.wake();
		//anony.method1();

//		Person teacher = new Person() {
//			void Teach{) {
//				System.out.println("Teach at 11.");
//				}
//			void wake() {
//				System.out.println("Wake up at 9.");
//				teach();
//			}
//		};
		
		//anony.method2(teacher);
		anony.method2(
				new Person() {
					void Teach() {
						System.out.println("Teach at 11.");
						}
					void wake() {
						System.out.println("Wake up at 9.");
						Teach();
					}
				}
		);
	}

}
