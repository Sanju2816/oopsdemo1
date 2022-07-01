package oopsdemo2;

class Bank
{
    void getRateofInterest()
    {
        System.out.println("5");
    }
    void display()
    {
        System.out.println("Welcome to Bank");
    }
}
class SBI extends Bank
{
	void getRateofInterest()
    {
        System.out.println("6");
    }
	void display()
	{
		System.out.println("welcome to sbi bank");
	}
}
class ICICI extends Bank
{
	void getRateofInterest()
    {
        System.out.println("7");
    }
}
class Axis extends Bank
{
	void getRateofInterest()
    {
        System.out.println("8");
    }
}


 class OverrideDemo {

	public static void main(String[] args) {
		
		
		SBI b1=new SBI();
        ICICI b2=new ICICI();
        Axis b3=new Axis();
       
        b1.display();/// base class method
       
        // invoke overridden method getRateofInterest() in SBI Class
        System.out.println("The Interest Rate of SBI is :");
        b1.getRateofInterest();
       
       
        b2.display();/// base class method
       
        // invoke overridden method getRateofInterest() in ICICI Class
        System.out.println("The Interest Rate of ICICI is :");
        b2.getRateofInterest();
       
        b3.display();/// base class method
       
        // invoke overridden method getRateofInterest() in AXIS Class
        System.out.println("The Interest Rate of Axis is :");
        b3.getRateofInterest();

	}

}
