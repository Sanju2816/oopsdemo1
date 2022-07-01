package exceptionsdemo;

import java.util.Scanner;

public class DivisonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, result;
        Scanner input = new Scanner(System.in);
       
         System.out.println("Input two integers :");
         a = input.nextInt();
         b = input.nextInt();
         
         try //statements to be monitored which may throw exception
         {
        	 result=a/b;
        	 System.out.println("result is:"+result);
         }
         catch(ArithmeticException e){ // Exception thrown is handled in catch block
        	 
        	 System.out.println("divide by zero error");
        	 System.out.println("exception description"+e.getMessage());
        	 System.out.println("exception name and description"+e.toString());
        	 e.printStackTrace();
        	 
        	    // Details abt exception Name, Description, Line number of code which generated Exception
        	 
         }
         finally // clean-up operations
         {
        	 input.close();
        	 System.out.println("in finally block");
        	 
         }

	}

}
