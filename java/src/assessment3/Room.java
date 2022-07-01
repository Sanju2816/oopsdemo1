package assessment3;

public class Room {
	
	int roomNo;
	String roomType;
	double roomArea;
	boolean acMachine;

 public void setData(int roomNo,String roomType,double roomArea,boolean acMachine)
 {
	 this.roomNo=roomNo;
	 this.roomType=roomType;
	 this.roomArea=roomArea;
	 this.acMachine=acMachine;
	 
 }
 public void displayData()
 {
	 System.out.println("The room no is" + roomNo);
	 System.out.println("The room Type is" + roomType);
	 System.out.println("The room area is" + roomArea);
	 System.out.println("The A / c Machine needed: " + acMachine);
 }
 



	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room=new Room();
		room.setData(101,"Luxury",678.9,true);
		room.displayData();

	}


}