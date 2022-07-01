package oopsdemo2;

public class SavingsBank  extends Account{
	
	private int min_bal;//can be accessed within class
	protected int balance;//can be accessed within class n sub class

	public SavingsBank(int accNo, String name) {
		super(accNo, name);
		
	}

	public SavingsBank(int accNo, String name, int min_bal, int balance) {
		super(accNo, name);
		this.min_bal = min_bal;
		this.balance = balance;
	}
	
	public void display()
	{
		super.display();
		System.out.println("minimum bal: "+min_bal);
		System.out.println("saving balance: "+balance);
	}
	
	
}
