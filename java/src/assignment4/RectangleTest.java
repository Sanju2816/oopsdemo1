package assignment4;

 class Rectt{
	  int length;
	  int breadth;

	  public Rectt(int l, int b){
	    length = l;
	    breadth = b;
	  }

	  public void printArea(){
	    System.out.println(length*breadth);
	  }

	  public void printPerimeter(){
	    System.out.println(2*(length+breadth));
	  }
	}

	class Square extends Rectt{
	  int side;
	  public Square(int s){
	    super(s,s);
	  }
	}
class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Rectt r = new Rectt(4,5);
		    r.printArea();
		    r.printPerimeter();

		    Square s = new Square(4);
		    s.printArea();
		    s.printPerimeter();


	}

}
