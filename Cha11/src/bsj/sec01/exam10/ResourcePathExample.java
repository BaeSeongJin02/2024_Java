package bsj.sec01.exam10;
//리소스 절대 경로 얻기
public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("imges/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
