package oopsdemo1;

//code for adding 2 complex nums
public class Complex {

	double real;
	double imaginary;
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	void add(Complex obj)//this method will take object as argument
	{
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	void display()
	{
		System.out.println("r"+this.real+"i"+this.imaginary);
	}
	 // calls method add() by passing object c2 System.out.println("The Addition of 2 Complex number is:"); c1.display(); // c3=c1+c2; c1.add3(c2, c3); System.out.println("The Addition of 3 Complex number is:"); c1.display();
}
