package ex02;

public class CallListener implements Button.OnClickListener {		//Button.OnClickListener <-중첩 클래스 (익명 클래스)
	public void OnClick() {
		System.out.println("Make a phone call!!");
	}

}
