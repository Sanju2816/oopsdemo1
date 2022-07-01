package oopsdemo1;


public class StudentTest {
public static void main(String[] args)
{
	Student s1=new Student();
	Student s2=new Student();
	s1.input();
	float tot=s1.calculate();
	s1.display();
	System.out.println("total display from main"+tot);
	s2.input();
	float tot1=s2.calculate();
	s2.display();
	System.out.println("total display fro main"+tot1);
	
			
}
}
