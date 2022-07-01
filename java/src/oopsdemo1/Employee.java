package oopsdemo1;

import java.util.Scanner;

public class Employee {
private int empId;
private String firstName,lastName,desig;
private double basic,hra,da,grossSal,netSal;
private static final double TAX=1000;
Scanner sc=new Scanner(System.in);

public void inputEmployeeDetails()
{
	System.out.println("enter employee id,first name,last name");
	empId=sc.nextInt();
	firstName=sc.next();
	lastName=sc.next();
	sc.nextLine();
	desig=sc.nextLine();
	System.out.println("enter employee basic slaray");
	basic=sc.nextDouble();
	
}
public void calculateNetSalary()
{
	hra=basic*0.15;
	da=basic*0.10;
	grossSal=basic+hra+da;
	netSal=grossSal-TAX;
}
public void displayEmployeeDetails()
{
	System.out.println("employee id"+empId);
	System.out.println("employee name"+firstName+" "+lastName);
	System.out.println("basic sal"+basic);
	System.out.println("hra"+hra);
	System.out.println("da"+da);
	System.out.println("gross sal"+grossSal);
	System.out.println("desig"+desig);
	System.out.println("tax"+TAX);
	System.out.println("-----------------------------------------------------");
	System.out.println("net salaray"+netSal);
}
}
