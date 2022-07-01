package basics;

import java.util.Scanner;

public class Greatest2 {
  public static void main(String[] args) {	// TODO Auto-generated method stub
	  int a,b;
      Scanner scan=new Scanner(System.in);
     
      System.out.println("Enter 2 NUmbers :");
      a=scan.nextInt();
      b=scan.nextInt();
     
      scan.close();
      if(a>b) {
    	  System.out.println("greatest num is"+a);
      }
      else
      {
    	  System.out.println("greatest num is"+b);
      }

}
}
