package oopsdemo2;

 class Staff {

	private int empId;
	private String name;
	protected float salary,hra;
	
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
	}
	
	public void getHra()
	{
		hra=(salary*60)/100;
		System.out.println("HRA:"+hra);
	}
	public void display()
	{
		System.out.println(empId+" "+name+" "+salary);
		
	}
	public void print()
	{
		System.out.println("gross salary of staff: "+(salary+hra));
	}
	
	
}
 class Manager extends Staff
{
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}

	private  float da,gross;
	
	void getDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is: "+da);
	}
	void getGross()
	{
		gross=salary+hra+da;
		System.out.println("gross sal of manager"+gross);
	}
	
}
 
 class Director extends Manager
 {
	 public Director(int empId, String name, float salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}

	private float ta,gross;
	 
	void getTa()
	{
		ta=(salary*30)/100;
		System.out.println("ta is"+ta);
	}
	void getGross()
	{
		gross=salary+hra+ta;
		System.out.println("gross sal is"+gross);
	}
 }
 
 
 

