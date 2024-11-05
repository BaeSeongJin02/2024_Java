package b8;

public class tset {

	public static void main(String[] args) {
		// 
		
		String[] strArray = new String[5];
		strArray[0] = "Suncheon";
		strArray[1] = "University";
		strArray[2] = new String("AI");
		strArray[3] = new String("University");
		strArray[4] = "Suncheon";

		System.out.println(strArray[0] == strArray[4]);
		System.out.println(strArray[1] == strArray[3]);
		System.out.println(strArray[1].equals(strArray[3]));
		
		strArray[2] = new String("Suncheon");
		strArray[3] = "University";
		
		System.out.println(strArray[0].equals(strArray[2]));
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0] == strArray[4]);
		System.out.println(strArray[0].equals(strArray[3]));
		System.out.println(strArray[0] == strArray[3]);
	}

}
