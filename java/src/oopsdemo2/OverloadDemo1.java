package oopsdemo2;



	 class Trainee
	{
		
		public void skills()
		{
			System.out.println("trainee skills informnation system");
		}
		public void skills(int id,String skills)
		{
			System.out.println(id+" "+skills);
		}
		public void skills(int id,String skills,String prgrming)
		{
			System.out.println(id+" "+skills+" "+prgrming);
		}
		public void skills(int id,String skills,String prgrming,String db)
		{
			System.out.println(id+" "+skills+" "+prgrming+" "+db);
		}
	}
	

public class OverloadDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee t1=new Trainee();
		t1.skills();
		t1.skills(123,"ddd");
		t1.skills(123, "ddff", "java");
		t1.skills(34, "hhjj", "python", "yes");

	}

}
