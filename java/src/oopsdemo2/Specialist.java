package oopsdemo2;

public class Specialist extends Doctor {

	
	public Specialist(int idNo, String name, String addrr,String sp) {
		super(idNo, name, addrr);
		this.speciality=sp;
		
	}

	String speciality;
	
	public void display()
	{
		super.display();
		System.out.println("specialist in"+speciality);
	}
	
	
}
 class NonSpecialist extends Doctor
{

	public NonSpecialist(int idNo, String name, String addrr) {
		super(idNo, name, addrr);
		// TODO Auto-generated constructor stub
	}
	
}
