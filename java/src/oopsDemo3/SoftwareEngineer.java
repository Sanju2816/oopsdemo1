package oopsDemo3;

public class SoftwareEngineer {
	
	protected String name,tech;
    double salary;
	
    
    public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
    
    final void display()
    {
        System.out.println(name+" "+tech+" "+salary);
    }
   
    void work()
    {
        System.out.println("Coding & Testing");
    }
    
    
}
class Developer extends SoftwareEngineer
{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);
		// TODO Auto-generated constructor stub
	}
	
	void work()
    {
        System.out.println("Coding using"+tech);
    }
	
}

class Tester extends SoftwareEngineer
{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		// TODO Auto-generated constructor stub
	}
	
	void work()
    {
        System.out.println("Testing using"+tech);
    }
	
	
}

 
