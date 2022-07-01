package exceptionsdemo;

public class ThrowsDemo  {

	void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
     
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
     
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsDemo tr=new ThrowsDemo();
		try
		{
			tr.Division();
		}
		catch(ArithmeticException Ex){
			System.err.print("error:"+Ex.getMessage());
		}
		System.out.println("end of prgrm");

	}

}
