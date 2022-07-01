package oopsdemo2;
//prgrm to implement single inhertance

public class AccountantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Accountant a1=new Accountant(123, "johns", "process salary of emplloyee", "sap");
		Accountant a2=new Accountant(123, "xyz", "prjct engineer", "tally");
		a1.display();
		a1.print();
		a2.display();
		a2.print();
		
		
	}

}
