package basics;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for N:");
		n=sc.nextInt();
		
		while(i<=n)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println("sum is"+sum);

	}

}
