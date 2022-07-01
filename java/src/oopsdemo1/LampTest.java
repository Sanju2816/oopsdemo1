package oopsdemo1;
class Lamp
{
	 boolean isOn;
     void turnOn()
     {
     	isOn=true;
     	System.out.println("Light on?"+isOn);
     }
     void turnOff()
     {
    	 isOn=false;
    	 System.out.println("light off?"+isOn);
     }
}

public class LampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		led.turnOn();
		halogen.turnOn();
		led.turnOff();
		halogen.turnOff();
      
	}

}
