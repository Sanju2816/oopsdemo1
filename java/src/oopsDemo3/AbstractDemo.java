package oopsDemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1=new Marks("john","new york",1001,35);
		t1.show();//invokes absract base method
		
		double marks=t1.calculateMarks();
		System.out.println(t1+" "+marks);
		
	}

}
