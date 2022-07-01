package oopsdemo1;

public class ConstructorDemo {
	int id;
	String name;
	float salary;
	ConstructorDemo()//Implicit
	{
		System.out.println("impllicit constructor");
		id=23;
		name="sanjana";
		salary=78.8f;
	}
	
	

	public ConstructorDemo(int id, String name, float salary) {
		System.out.println("iam parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c1=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo(143,"sanju",67.9f);
		ConstructorDemo c3=new ConstructorDemo();
		c1.display();
		c2.display();
		c3.display();
		
		
		
	}

}
