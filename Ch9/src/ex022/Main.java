package ex022;

public class Main {

	public static void main(String[] args) {
		
		new Button().SetOnClickLIstener(new Button.OnClickListener() { 		//new Button().
				public void OnClick() {
					System.out.println("Make a phone call!!");
				}

			}
		).Touch();
		//callButton.Touch();
		
	
		new Button().SetOnClickLIstener(new Button.OnClickListener() {
				public void OnClick() {
					System.out.println("Send a phone call!!");	
				}
			}
		).Touch();
		//messageButton.Touch();
	}
}
