package oopsdemo1;
class Employee23
{
	int empId;
	String name;
	void setData(int c,String d)
	{
		empId=c;
		name=d;
	}
	void showData()
	{
		System.out.print("emp id"+empId+"employee name"+name);
		System.out.println();
	}
}

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee23[] emp=new Employee23[5];
		for(int i=0;i<5;i++)
		{
			emp[i]=new Employee23();
		}
		emp[0].setData(100, "sanju");
		emp[1].setData(200,"xyz");
		emp[2].setData(3, "sanjuuu");
		for(int i=0;i<3;i++)
		{
			emp[i].showData();
		}
		System.out.println("*************");
		
	}

}
