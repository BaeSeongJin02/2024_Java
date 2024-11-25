package ex05;

public class Anonymous {
	//RemoteController TV = new TV();
	RemoteController TV = new RemoteController() {
			public void TurnOn() {
				System.out.println("TV를 켭니다.");
			}
			
			public void TurnOff() {
				System.out.println("TV를 끕니다.");
			}
	};
}
