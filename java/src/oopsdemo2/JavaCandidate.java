package oopsdemo2;

public class JavaCandidate  extends Candidate{

	
	public JavaCandidate(int id, String name, double salary,String t) {
		super(id, name, salary);
		this.tech=t;
		// TODO Auto-generated constructor stub
	}
	private String tech;
	private double perks;
	
	public void getPerks()
	{
		perks=salary*.10;
		System.out.println("perks of candidate"+perks);
		System.out.println("technology"+tech);
	}
	
	
}
