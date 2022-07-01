package oopsdemo1;

public class Trainee {

	private int id;
	private String name,tech;
	private double stipend;
	public Trainee() {
		
		this.id=121;
		this.name="sanjana";
		this.tech="java";
		this.stipend=67899;
		
	}
	public Trainee(int id, String name, String tech, double stipend) {
		
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	void display()
	{
		System.out.println("********trainee profile************");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
	}
	
	
	
}
