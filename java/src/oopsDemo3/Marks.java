package oopsDemo3;

public class Marks extends Trainee{

	
	private double marks;
	
	
	public Marks(String name, String address, int number,double marks) {
		super(name, address, number);
		this.marks=marks;
		
	}

	

	@Override
	public double calculateMarks() {
		// TODO Auto-generated method stub
		System.out.println("calculate marks: ");
		return (marks*2);
	}
	
	
	
}
