package oopsdemo1;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(23.4,56.7);
		Complex c2=new Complex(3.4,6.7);
		Complex c3=new Complex(3.4,6.7);
		c1.add(c2);
		System.out.println("additon of 2 complex nums");
		c1.display();
		c1.add(c3);
		System.out.println("addition of three numbers");
		c1.display();
		

	}

}
