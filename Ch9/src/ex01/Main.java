package ex01;

public class Main {

	public static void main(String[] args) {
		Button callButton = new Button();
//		CallListener callListener = new CallListener();
//		callButton.SetOnClickLIstener(callListener);
		callButton.SetOnClickLIstener(new CallListener());	//위에 주석처리한 것과 동일
		callButton.Touch();
		
		Button messageButton = new Button();
//		MessageListener messageListener = new MessageListener();
//		messageButton.SetOnClickLIstener(messageListener);
		messageButton.SetOnClickLIstener(new MessageListener());	//위에 주석처리한 것과 동일
		messageButton.Touch();

	}

}
