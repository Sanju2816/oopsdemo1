package basics;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***********student details************");
		System.out.println("enter student roll no");
		int roll=sc.nextInt();
		System.out.println("enter student name");
		String name=sc.next();
		System.out.println("enter student marks");
		float m1=sc.nextFloat();
		float m2=sc.nextFloat();
		float m3=sc.nextFloat();
		float m4=sc.nextFloat();
		float m5=sc.nextFloat();
		float total=(m1+m2+m3+m4+m5);
		float agg=(total*10)/500;
		System.out.println("**********student REsult************");
		System.out.println("student roll no"+roll);
		System.out.println("student name"+name);
		System.out.println("total marks"+total);
		System.out.println("aggregate"+agg);
		if(agg>8.5)
		{
			System.out.println("Result:Distinction");
		}
		else if(agg>=7 && agg<8.5)
		{
			System.out.println("REsult:First class");
		}
		else if(agg>=5 && agg<7)
		{
			System.out.println("REsult:second class");
		}
	     else if(agg >=4  && agg <5)
	        {
	            System.out.println("Result : Pass Class");
	        }
	        else
	        {
	            System.out.println("Result : Fail");
	        }
	}
}
