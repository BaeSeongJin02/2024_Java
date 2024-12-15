package bsj.sec01.exam05;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		//Member 객체를 중복 없이 저장하는 HashSet
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("배성진", 30));
		set.add(new Member("배성진", 30));
		
		System.out.println("총 객체수 : " + set.size());
	}
}

