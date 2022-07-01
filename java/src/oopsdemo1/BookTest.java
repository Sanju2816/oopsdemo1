package oopsdemo1;

public class BookTest {

	public static void main(String[] args)
	{
		Book b1=new Book();
		b1.setBookId(23);
		b1.setBookName("java");
		b1.setPrice(56);
		b1.setPublisher("prime books");
		System.out.println("************book details***********");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("discounted proce"+b1.discountPrice());
		System.out.println(b1);
		
	}
}
