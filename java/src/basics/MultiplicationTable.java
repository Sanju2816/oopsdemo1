package basics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int  num=sc.nextInt();
		System.out.println("************MULTIPLICATION TABLE***********");
		int i=1;
		do
		{
			
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
				
			
		}while(i<=10);
		sc.close();
		

	}

}
