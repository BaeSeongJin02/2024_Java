package ex07;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
//		m.testTV(new RemoteController() {
//			public void TurnOn() {
//				System.out.println("TV를 켭니다.");
//			}
//			
//			public void TurnOff() {
//				System.out.println("TV를 끕니다.");
//			}
//		}
//		);
		
		RemoteController rc = new TV();
		m.testTV(rc);
		

	}
	
	void testTV(RemoteController rc) {
		rc.TurnOn();
		rc.TurnOff();
	}

}
