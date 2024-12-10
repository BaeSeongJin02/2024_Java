package bsj.sec01.exam21;

public class StringTrimExample {

	public static void main(String[] args) {
		// 문자열 앞뒤 공백 제거
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
