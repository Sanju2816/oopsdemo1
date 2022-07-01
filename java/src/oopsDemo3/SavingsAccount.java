package oopsDemo3;

class SavingsAccount extends Account{

	public SavingsAccount(String name, double balance,double it) {
		super(name, balance);
		this.interestRate=it;
		// TODO Auto-generated constructor stub
	}

	double interestRate;
	
}
 class CheckingAccount extends Account
{
	public CheckingAccount(String name, double balance,double od) {
		super(name, balance);
		this.overDraft=od;
		// TODO Auto-generated constructor stub
	}

	double overDraft;
    void withdraw(double amt) {
        System.out.println("Overdraft Amount: " + overDraft);
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawing: " + amt);
        } else if ((amt > balance) && (amt > (balance + overDraft))) {
            System.out.println("Sorry! You cannot withdraw");
        } else {
            double result = amt - balance;
            overDraft -= result;
            balance = 0;

 

            System.out.println("Withdrawing: " + amt);
            System.out.println("Current Overdraft Amount: "
                    + overDraft);
        }

 


    }
 
	
}
