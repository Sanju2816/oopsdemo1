package assignment5;

public class NissanTruck implements Truck{

	 int numberOfAxles;
	 int totalWeight;
	 String name="Nissan Truck";
	
	 public NissanTruck(int numberOfAxles, int totalWeight) {
		this.numberOfAxles = numberOfAxles;
		this.totalWeight = totalWeight;
		
	}
	
	@Override
	public int noOfAxles() {
		 return numberOfAxles;
	}
	@Override
	public int totalWeight() {
		  return totalWeight;
	}
	@Override
	public String getName() {
		  
		  return name;
	}
	 
	 
}
