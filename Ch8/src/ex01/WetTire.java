package ex01;

public class WetTire implements Tire{
	int maxDistance = 100;
	int distance = 0;
	
	public void SetData(int speed, int distance) {
		this.distance = distance;
	}
	
	public boolean NeedChange() {
		if (distance > maxDistance)
			return true;
		else
			return false;
	}
	
}
