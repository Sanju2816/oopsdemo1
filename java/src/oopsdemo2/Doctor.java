package oopsdemo2;

public class Doctor {

	int idNo;
	String name;
	String addrr;
	public Doctor(int idNo, String name, String addrr) {
		this.idNo = idNo;
		this.name = name;
		this.addrr = addrr;
	}
	public void display()
	{
		System.out.println("**doctor details*********");
		System.out.println("id number"+idNo);
		System.out.println("doctor name"+name);
		System.out.println("address is"+addrr);
	}
	
	
}
