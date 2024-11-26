package ex021;

public class Main {

	public static void main(String[] args) {
		Button callButton = new Button();
		callButton.SetOnClickLIstener(new Button.OnClickListener() { //재정의
				public void OnClick() {
					System.out.println("Make a phone call!!");
				}

			}
		);
		callButton.Touch();
		
		Button messageButton = new Button();
		messageButton.SetOnClickLIstener(new Button.OnClickListener() {
				public void OnClick() {
					System.out.println("Send a phone call!!");	
				}
			}
		);
		messageButton.Touch();
	}

}
