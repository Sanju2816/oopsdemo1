package assessment3;
import java.util.*;

public class Area {

	Scanner sc=new Scanner(System.in);
	private int length;
	private int breadth;
	public void getData()
	{
		
		length=sc.nextInt();
		breadth=sc.nextInt();
	}
	public int returnArea()
	{
		return length*breadth;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		System.out.println("enter length and breadth");
		a.getData();
		System.out.println("area of rectangle is"+a.returnArea());
	

	}

}
