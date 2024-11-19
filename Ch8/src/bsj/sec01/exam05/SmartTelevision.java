package bsj.sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable {
	//다중 인터페이스 구현 클래스
	public int volume;
	
	public void turnOn() {
		System.out.println("TV 를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV 를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOULME) {
			this.volume = RemoteControl.MAX_VOULME;
		} else if (volume <  RemoteControl.MIN_VOULME) {
			this.volume = RemoteControl.MIN_VOULME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
