package basics;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Enter a Sentence :");
	        String s=scan.nextLine(); // method takes sentence input
	        scan.close();
	        int count=0;
	        System.out.println("The Length of String is : "+s.length());
	        for(int i=0;i<s.length();i++)
	        {
	        	if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u')
	        	{
	        		count+=1;
	        		System.out.println("vowels found "+s.charAt(i));
	        	}
	        }
	        System.out.println("total no of vowels found "+count);

	}

}
