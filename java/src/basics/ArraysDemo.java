package basics;
import java.util.Arrays;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {23,45,6,7,67,5,4,3};
		int i;
		System.out.println("**********Array Contents*************");
		for(i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("arrays length"+nums.length);
		System.out.println("arrays first element"+nums[0]);
		System.out.println("arrays last element"+nums[nums.length-1]);
		   System.out.println("*******************************************");
	       
	        int n,j;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter 2nd Array Size : ");
	        n=s.nextInt();
	        int num[]=new int[n];
	        System.out.println("enter array elemnets");
	        for(j=0;j<n;j++)
	        {
	        	
	        	num[j]=s.nextInt();
	        }
	        System.out.println("********** 2nd Array Contents **********");
	        for(j=0;j<num.length;j++)
	        {
	            System.out.print(num[j]+ " ");
	        }
	        System.out.println();
	        System.out.println("Display Array contents Without Loop :");
	        System.out.println(Arrays.toString(num));

	}

}
