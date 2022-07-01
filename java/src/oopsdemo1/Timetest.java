package oopsdemo1;

public class Timetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1=new Time(12,45,55);
		Time t2=new Time(10,30,30);
		
		t1.add(t2);
		System.out.println("additoon of two times");
		t1.display();

	}

}
