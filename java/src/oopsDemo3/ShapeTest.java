package oopsDemo3;

public class ShapeTest {

	public static void main(String[] args) {
		 Shape shape=new Circle(10);
		  System.out.println("Using Interface : "+shape.LABLE);
		  shape.draw();
		  System.out.println("Area of circle : "+shape.getArea());
		  
		  //switching from one implementation to another easily
		  shape=new Rectangle2(10,7);
		  shape.draw();
		  System.out.println("Area of Rectangle : "+shape.getArea());
		  
	}

}
