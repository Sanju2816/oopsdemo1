package assignment4;

class Rect
{
	int length;
	int breadth;
	
	public Rect(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int Area()
	{
		return length*breadth;
	}
	
	
}

public class Rectangle {
	
	public static void main(String[] args)
	{

	Rect r1=new Rect(4,5);
	Rect r2=new Rect(5,8);
	
	System.out.println("first rectangle area: "+r1.Area());
	System.out.println("second rectangle area: "+r2.Area());
	
	
	
	}
	
	
}
