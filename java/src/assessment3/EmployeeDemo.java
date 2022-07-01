package assessment3;
import java.util.*;


public class EmployeeDemo {
	
	 int salary;
	 int noOfHours;
	Scanner sc=new Scanner(System.in);
	
	public  void getInfo()
	{
		salary=sc.nextInt();
		noOfHours=sc.nextInt();
	}
	public void AddSal()
	{
		salary+=10;
	}
	public void AddWork()
	{
		salary+=5;
	}
	public void modify()
	{
		if(salary<500)
		{
			AddSal();
		}
		if(noOfHours>6)
		{
			AddWork();
		}
		
	}
	public int  display()
	{
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter salary and no of hours");
		EmployeeDemo emp=new EmployeeDemo();
		emp.getInfo();
		emp.modify();
	    System.out.println("final salary");
	    System.out.println(emp.display());
		
		

	}

}
