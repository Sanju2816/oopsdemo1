package oopsdemo2;

public class AggregationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a1=new  Author("jogn", 56, "usa");
		Publisher publisher=new Publisher("sam","jogn","hg");
		Book b1=new Book("java",677,a1,publisher);
		b1.display();

	}

}
