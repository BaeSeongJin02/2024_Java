package b10;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student("김철수", 2);
		Student s3 = new Student("고영희", 4.3);
		
		System.out.println("이름 : " + s3.getName() + " 연도 : " + s3.getYear() 
		+ "학년 : " + s3.getGrade());
		
	}

}
