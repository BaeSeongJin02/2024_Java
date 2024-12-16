package ex18;

public class School {
	Teacher teacherfield = new Teacher () {
		void prepare() {
			System.out.println("선생님이 수업을 준비합니다.");
		}
		@Override
		void teach() {
		prepare() ;
		System.out.println("선생님이 수업을 진행합니다.");
		}
	};
	Student studentfield = new Student() {
		@Override
		void study() {
		System.out.println("시험기간인 학생이 열심히 공부합니다.");
		}
	};
	void method1() {
	Student localStudent = new Student() {
		void sleep() {
			System.out.println("학생이 잡니다.");
		}
		@Override
		void study() {
			System.out.println("학생이 공부하지않습니다.") ;
			sleep ();
			}
		};
	localStudent.study();
	}
	
	void method2(Teacher teacher, Student student) {
		teacher.teach();
		student.study();
		}
}
