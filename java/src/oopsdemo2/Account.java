package oopsdemo2;

//example for multi level inheritance
public class Account {

	int accNo;
	String name;
	
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println("****************account details******************");
		System.out.println("accoutn num: "+accNo);
		System.out.println("customer name: "+name);
		
	}
}
