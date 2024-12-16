package ex18;

public class SchoolExample {
	public static void main(String[] args) {
		School school = new School();
		
		school.teacherfield.teach();
		school.studentfield.study();
		
		System.out.println();
		school.method1();
		
		System.out.println();
		school.method2(
				new Teacher() {
					@Override
					void teach() {
						System.out.println("선생님이 자바를 가르칩니다.");
					}
				}, 
				new Student() {
					@Override
					void study() {
						System.out.println("학생이 자바를 공부합니다.");
					}
				}
			);
	}

}
