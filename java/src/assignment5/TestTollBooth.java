package assignment5;

public class TestTollBooth {

	public static void main(String[] args) {
		 
		  
		  TollBooth booth=new AlleghenyTollBooth();
		  
		  
		  Truck ford= new FordTruck(5, 12500);
		 
		 
		  Truck nissan=new NissanTruck(2, 5000);
		  
		
		  Truck daewoo=new DaewooTruck(6, 17000);
		  
		  System.out.println("**********Welcome to fordTruck**************");
		  booth.calculateToll(ford);
		 
		  System.out.println("**************Welcome to NissanTRuck***********");
		  booth.calculateToll(nissan);
		  
		  System.out.println("*******Welcome to DaewooTruck**********");
		  booth.calculateToll(daewoo);
		
		  booth.displayData();
		  booth.resetReceipts();

	}

}
