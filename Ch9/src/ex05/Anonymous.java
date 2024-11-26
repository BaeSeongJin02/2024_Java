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
	
	
	public void TVControl() {	
			RemoteController localTV = new RemoteController() {
				public void TurnOn() {
					System.out.println("TV를 켭니다.");
				}
		
				public void TurnOff() {
					System.out.println("TV를 끕니다.");
				}
			};
			localTV.TurnOn();
			localTV.TurnOff();
	}
	
	public void TVTurnOnAndTurnOff(RemoteController rc) {		
		rc.TurnOn();
		rc.TurnOff();
	}
}
