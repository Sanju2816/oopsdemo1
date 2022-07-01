package oopsDemo3;

public class Student {

	private int rollNo;
    private String name;
    private static String college="CMR";
    
    public Student(int rollNo,String name)
    {
    	this.rollNo=rollNo;
    	this.name=name;
    	
    }
    static void collegeChange()
    {
        college="Griet";
    }

 

    void display()
    {
        System.out.println(rollNo+" "+name+" "+college);
    }
    
}
