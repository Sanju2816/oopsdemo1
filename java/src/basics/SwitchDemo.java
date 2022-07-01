package basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,res;
        String op;
        Scanner   s=new Scanner(System.in);

 

         System.out.println("Enter 2 numbers :");
         a=s.nextInt();
         b=s.nextInt();
         System.out.println("Enter Operator :"); // +, -, *, /
         op=s.next();
         
         s.close();
         switch(op)
         {
         case "+":
        	 res=a+b;
        	 System.out.println("additiom is"+res);
        	 break;
        	 
         case "-":
        	 res=a-b;
        	 System.out.println("subtraction is"+res);
        	 break;
        	 
        	 
         case "*":
        	 res=a*b;
        	 System.out.println("multiplication is"+res);
        	 break;
        	 
         case "/":
        	 res=a/b;
        	 System.out.println("division is"+res);
        	 break;
        	 
         default:
        	 System.out.println("invalid operator");
        	 break;
         }

	}

}
