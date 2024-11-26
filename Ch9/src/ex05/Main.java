package ex05;

public class Main {

	public static void main(String[] args) {
		// 시험 출제 !!!!!!!!!!!
		
		Anonymous anony = new Anonymous();
		//anony.TV.TurnOn();
		//anony.TV.TurnOff();
		
		//anony.TVControl();
		
		anony.TVTurnOnAndTurnOff(new RemoteController() {	//RemoteCocntrolorr() 재정의 필요
			public void TurnOn() {
				System.out.println("TV를 켭니다.");
			}
			
			public void TurnOff() {
				System.out.println("TV를 끕니다.");
			}
		}
		);		//한 번만 쓰는 클래스나 함수를 만들지않기 위해
	}
}


