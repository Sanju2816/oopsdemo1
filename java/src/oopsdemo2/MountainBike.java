package oopsdemo2;

public class MountainBike extends Bicycle {

	
	public int seatHeight;
	public MountainBike(int gear, int speed,int s) {
		super(gear, speed);
		this.seatHeight=s;
		
	}

	

	public void setSeatHeight(int seatHeight) { //just generate setter
		this.seatHeight = seatHeight;
	}



	@Override
	public String toString() {
		
		return super.toString()+"MountainBike [seatHeight=" + seatHeight + "]";
	}
	
	
	
	
}
