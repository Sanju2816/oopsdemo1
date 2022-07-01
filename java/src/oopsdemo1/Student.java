package oopsdemo1;

import java.util.Scanner;

//instance class
public class Student {

	private int rollNumber;
	private String name,course;
	private float m1,m2,m3,total;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("enter roll no,name,course");
		rollNumber=sc.nextInt();
		name=sc.next();
		course=sc.next();
		System.out.println("enter marks for 3 subjects");

		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
		
	}
	public float calculate()
	{
		total=m1+m2+m3;
		return total;
	}
	public void display()
	{
		System.out.println("****************student details*****************");
		System.out.println("roll no:"+rollNumber);
		System.out.println("name:"+name);
		System.out.println("course:"+course);
		System.out.println("total marks"+total);
	}
	
	
	
	}


