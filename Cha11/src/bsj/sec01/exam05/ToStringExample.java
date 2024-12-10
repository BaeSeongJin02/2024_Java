package bsj.sec01.exam05;

import java.util.Date;

//객체의 문자 정보(to String() 메소드)
public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
