package basics;

public class TernaryDemo {

	public static void main(String[] args)
	{
		
		int a=100;
		int b=200;
		int max;
		System.out.println("enter a "+a);
		System.out.println("enter b"+b);
		max=(a>b)?a:b;
		String msg=(a>b)?"a is greater":"b is greater";
	     System.out.println("The Maximum of 2 nos is :"+max + " ."+msg);
	}
	
}
