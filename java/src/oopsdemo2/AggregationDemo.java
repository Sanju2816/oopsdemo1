package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad1=new Address("Banswada", "Ts", "India", 503187);
		Address ad2=new Address("Nirmal", "Nirmal", "India", 503897);
		Student s1=new Student(19087,"sanjana",ad1);
		Student s2=new Student(19089,"meghana",ad2);
        
		s1.display();
		s2.display();

	}

}
