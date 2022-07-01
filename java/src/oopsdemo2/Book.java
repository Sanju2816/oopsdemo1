package oopsdemo2;
//aggregation represents a has-a relationship
public class Book {

	String name;
	int price;
	//aggregation
	
	Author author;
	Publisher publisher;
	
	public Book(String name, int price, Author author, Publisher publisher) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
	
	void display()
	{
		System.out.println("********************Book details*******************");
		System.out.println("BOok name"+name);
		System.out.println("book proce"+price);
		
		System.out.println("**********author details***************");
		System.out.println("author name"+author.authorName);
		System.out.println("author age"+author.age);
		System.out.println("author place"+author.place);
		
		System.out.println("**********publisher details*********");
		System.out.println("publiseher name"+publisher.name);
		System.out.println("publisher id"+publisher.publisherId);
	}
	
	
	
}
