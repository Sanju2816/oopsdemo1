package oopsdemo2;

//child class derived from the parent class
public class Accountant extends Employee {
	String task,tech;

	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);
		this.task=t1;
		this.tech=t2;
		
		
	}
	void print()
	{
		System.out.println("Accountant task: "+task);
		System.out.println("Accountant technology: "+tech);
	}

}
