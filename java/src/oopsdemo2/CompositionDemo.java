package oopsdemo2;



 class Honda extends Car
	{
		public void hondaStart()
		{
			Engine heng=new Engine();
			heng.startEngine();
			
		}
	
	}
	class Hyundai extends Car
	
	{
		public void HyundaiStart()
		{
			Engine heng=new Engine();
			heng.startEngine();
			
		}
	}
	
	
	
	
	public class CompositionDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //car class methods hondaCity.setMax_speed(180); //car class methods System.out.println("**Honda Car Details ****"); System.out.println(hondaCity.getColor() +" Color");//car class methods System.out.println(hondaCity.getMax_speed()+" Speed");//car class methods hondaCity.hondaStart();

		Honda honda=new Honda();
		honda.setColor("silver");
        honda.setMax_speed(180);
        
        System.out.println("****honda car demo*****");
		System.out.println(honda.getColor());
		System.out.println(honda.getMax_speed());
		honda.hondaStart();
		
		Hyundai hyundai=new Hyundai();
		hyundai.setColor("white");
		hyundai.setMax_speed(200);
        
        System.out.println("****honda car demo*****");
		System.out.println(hyundai.getColor());
		System.out.println(hyundai.getMax_speed());
		hyundai.HyundaiStart();
		
		

		}

}
