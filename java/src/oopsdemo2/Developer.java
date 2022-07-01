package oopsdemo2;

public class Developer  extends Employee{
	
	String technology;
	public Developer(int empId, String name,String t) {
		super(empId, name);
		this.technology=t;
		// TODO Auto-generated constructor stub
	}
	
	void display1()
	{
		System.out.println("technology used"+technology);
	}
}
