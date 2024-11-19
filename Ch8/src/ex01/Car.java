package ex01;

public class Car {
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;


	Car()	{
		this.frontLeftTire = new WetTire();
		this.frontRightTire = new WetTire();
		this.backLeftTire = new DryTire();
		this.backRightTire = new DryTire();
	}
	
	public void SetData(int speed, int distance) {
		frontLeftTire.SetData(speed, distance);
		frontRightTire.SetData(speed, distance);
		backLeftTire.SetData(speed, distance);
		backRightTire.SetData(speed, distance);
	}
	
	public boolean NeedChangeTire() {
		if(frontLeftTire.NeedChange()) 
			return true;
		else if (frontRightTire.NeedChange())
			return true;
		else if (backLeftTire.NeedChange())
			return true;
		else if (backRightTire.NeedChange())
			return true;
		else
			return false;
		
	}
	
	
}
