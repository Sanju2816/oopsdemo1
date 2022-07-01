package oopsdemo1;

import java.util.Scanner;

public class BookStore {

	private long bookId;
	private String authorName;
	private String bookName;
	private double bookPrice;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("enter book id,book name,book proce");
		bookId=sc.nextInt();
		authorName=sc.next();
		bookName=sc.next();
		bookPrice=sc.nextFloat();
	}
	public void display()
	{
		System.out.println("***********book details**************");
		System.out.println("book id"+bookId);
		System.out.println("author name"+authorName);
		System.out.println("book name"+bookName);
	}
}
