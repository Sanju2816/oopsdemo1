package oopsdemo2;

public class AccountsCandidate extends Candidate {

	public AccountsCandidate(int id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	double perks;
	
	void getPerks()
	{
		perks=salary*.05;
		System.out.println("perks of accountant candidate is"+perks);
		
	}
}
