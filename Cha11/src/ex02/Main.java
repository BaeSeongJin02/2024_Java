package ex02;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Student student = new Student("Lee", 99);
		
		//System.out.println(student.toString());
		m.ShowInfo(student);
		Worker worker = new Worker(99);
		m.ShowInfo(worker);
		
	}
	
	public void ShowInfo(Object obj) {
		System.out.println("Object name : " + obj.toString());
	}

}
