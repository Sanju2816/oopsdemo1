package oopsDemo3;

public abstract class Trainee {

	private String name;
    private String address;
    private int number;
	
    
    public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
    
    public abstract double calculateMarks();//abstract method-must be overriden in derived class
    
    void show()
    {
        System.out.println("Display Marks for :" +this.name+ " "+this.address);
    }

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
    
    
	
}
