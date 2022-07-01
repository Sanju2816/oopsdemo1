package oopsdemo1;
//java prgrm to perform additon of 2 times
/*t1-->12:45:55
*t2-->10:30:30
*     23 16 25
*     t1+t2
*     if sec>60...min should be incremented by 1 and hours should be decremneted by 60
*     if min>60 ...hrs should be incremented by 1 and min should be decremented by 60
*     
*/
 
public class Time {

	int hr,min,sec;
	public Time()
	{
		hr=min=sec=0;
	}
	public Time(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	void add(Time obj)
	{
		this.sec+=obj.sec;
		if(this.sec>=60 && this.sec<=119)
		{
			this.min+=1;
			this.sec-=60;
		}
		if(this.sec==120)
		{
			this.min+=2;
			this.sec-=120;
			
		}
		this.min+=obj.min;
		if(this.min>=60)
		{
			this.hr+=1;
			this.min-=60;
		}
		this.hr+=obj.hr;
	}
	void display()
	{
		System.out.println(this.hr+" "+this.min+" "+this.sec);
	}
}
