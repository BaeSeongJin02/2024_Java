package bsj.ex01;

public class Member {
	int id;
	
	public Member(int id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(m.id == this.id)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}
