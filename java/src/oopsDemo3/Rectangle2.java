package oopsDemo3;

public class Rectangle2 implements Shape{

	private double width;
	 private double height;
	 
	 
	 public Rectangle2(double width, double height) {
	  this.width = width;
	  this.height = height;
	 }

	 @Override
	 public void draw() {
	  System.out.println("Drawing Rectangle");
	   
	 }

	 @Override
	 public double getArea() {
	  
	  return this.height*this.width;
	 }
}
