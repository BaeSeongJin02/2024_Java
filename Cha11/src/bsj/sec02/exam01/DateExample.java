package bsj.sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// 현재 날짜를 출력하기
		Date now = new Date();
		String strNow1 = now.toString();
			System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 hh시 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}
