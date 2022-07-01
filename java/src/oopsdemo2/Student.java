package oopsdemo2;

public class Student {

	
	int rollno;
	String name;
	Address ad;
	
	
	public Student(int rollno, String name, Address ad) {
		this.rollno = rollno;
		this.name = name;
		this.ad = ad;
	}
	public void display()
	{
		System.out.println("student details");
		System.out.println("student rol no:"+rollno);
		System.out.println("student name:"+name);
		System.out.println("address:"+ad.city+" "+ad.state+" "+ad.country+" "+ad.pinCode);
	}
	
	
	
}
