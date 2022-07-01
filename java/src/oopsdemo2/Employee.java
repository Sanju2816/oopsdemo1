package oopsdemo2;

public class Employee {//parent clas or base cls or super cls

	
	int empId;
    String name;
    
    
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	void display()
	{
		System.out.println("employee details");
		System.out.println("employee id"+empId);
		System.out.println("employee name"+name);
	}
	


	
}
