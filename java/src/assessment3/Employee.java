package assessment3;

public class Employee {

	private String name;
	private int year;
	private double salary;
	private String address;
	public Employee(String name,int year,double salary,String address)
	{
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.address=address;
		
	}
	public void display()
	{
		System.out.println("Name"+" "+"Year"+" "+"salary"+" "+"address");
		System.out.println(name+" "+year+" "+salary+" "+address);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee("Robert",1994,20000,"Wallstreet");
		emp.display();
		Employee emp1=new Employee("Sam",1954,20000,"Wallstreet");
		emp1.display();
		Employee emp2=new Employee("Joha",2000,20000,"Wallstreet");
		emp2.display();
	}

}
