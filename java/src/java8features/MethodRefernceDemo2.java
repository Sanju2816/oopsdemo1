package java8features;

//Program to demonstrate Method reference to an instance method of a class

@FunctionalInterface
interface IDemo
{
 void sum(int  x,int y);
}

class Calculation
{
 void addition(int  a,int b)
 {
     System.out.println("The Addition is : "+(a+b));
 }
}

public class MethodRefernceDemo2 {

	public static void main(String[] args) {
		Calculation c1=new Calculation();
		
		//using lambda operation
		IDemo d1=(a,b)->System.out.println("addition of two nums is "+(a+b));
		d1.sum(78,88);
		
		//using method reference to call instance method
		IDemo d2=c1::addition;
		d2.sum(10,20);
		

	}

}
