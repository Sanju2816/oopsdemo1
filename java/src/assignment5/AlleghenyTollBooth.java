package assignment5;

public class AlleghenyTollBooth implements TollBooth{

	 int totalCollection=0;
	 int numberOfTrucks=0;
	 int tolldue;
	@Override
	public void calculateToll(Truck truck) {
		
		 
		 System.out.println("Arrival of "+truck.getName());
		  int axles=truck.noOfAxles();
		  int totalWeight=truck.totalWeight();
		  tolldue=(5*axles)+((totalWeight/500)*10);
		  
		  numberOfTrucks+=1;    
		  totalCollection=totalCollection+tolldue;
		  
		  
		  
		  System.out.println("Truck arrival-Axles: "+axles+" Total weight: "+totalWeight+ " Toll due: $"+tolldue);
		  System.out.println();
		
	}
	@Override
	public void displayData() {
		System.out.println("********Collecting Receipts***********");
		System.out.println("Totals since the last collection-Receipts:$"+totalCollection+" Trucks:"+numberOfTrucks);
		System.out.println();
		
	}
	@Override
	public void resetReceipts() {
		totalCollection=0;
		numberOfTrucks=0;
		System.out.println("***********Reset Receipts************");
		System.out.println("Totals since the last collection-Receipts:$"+totalCollection+" Trucks:"+numberOfTrucks);
		
		
	}
	
	
}
