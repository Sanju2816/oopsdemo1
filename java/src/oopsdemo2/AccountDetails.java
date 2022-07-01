package oopsdemo2;

//this class act as transaction class
public class AccountDetails extends SavingsBank{

	int withdrawl,deposit,finalBalance;
	
	public AccountDetails(int accNo, String name, int min_bal, int balance,int w,int d) {
		super(accNo, name, min_bal, balance);
		this.withdrawl=w;
		this.deposit=d;
	}

	public void display()
	{
		super.display();
		System.out.println("deposit: "+deposit);
		System.out.println("withdrawl: "+withdrawl);
		finalBalance=(balance+deposit)-withdrawl;
		System.out.println("final balance: "+finalBalance);
	}
	
}
