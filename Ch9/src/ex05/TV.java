package ex05;

public class TV implements RemoteController {
	public void TurnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void TurnOff() {
		System.out.println("TV를 끕니다.");
	}
}
