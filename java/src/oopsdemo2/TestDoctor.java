package oopsdemo2;

public class TestDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Specialist sp=new Specialist(123, "johns", "america", "cardiologist");
		sp.display();
		NonSpecialist no=new NonSpecialist(23, "mary", "New York");
		no.display();
		
	}

}
