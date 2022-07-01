package assignment4;

 class Member {

	 String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	  }
}
  class Employee extends Member
    {
	  String specialization;
	}

   class Manager extends Member
   {
	  String department;
	}
   
   

