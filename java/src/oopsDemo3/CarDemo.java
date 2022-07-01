package oopsDemo3;

public class CarDemo {

	public static void main(String[] args) {

		System.out.println("Details of Maruti cars : ");
		  Maruthi c1=new Maruthi();
		  c1.CarFeatures();
		  c1.isAutomatic();
		  c1.highTechAc();
		  c1.modelName();
		  
		  System.out.println("-------------------------------");
		  
		  System.out.println("Details of Audi cars : ");
		  Audi c2=new Audi();
		  c2.CarFeatures();
		  c2.isAutomatic();
		  c2.highTechAc();
		  c2.modelName();
	}

}
