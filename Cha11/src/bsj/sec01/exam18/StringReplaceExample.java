package bsj.sec01.exam18;

public class StringReplaceExample {

	public static void main(String[] args) {
		// 문자열 대치하기
		String oldStr = "자바는 객체 지향 언어입ㄴ디ㅏ. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
