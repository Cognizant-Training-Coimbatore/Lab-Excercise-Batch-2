package gokul;
class Member
{
	void initialize(String na,int a,int pn,String add,int sal)
	{
	 String name;
	 int age;
	 int phonenumber;
	 String address;
	 int salary;
	}
}
	class Employee extends Member
	{
		
		Employee(String na,int a,int pn,String add,int sal)
		{
			System.out.println("Employee details");
			String name=na;
			int age=a;
			int phonenumber=pn;
			String address=add;
			int salary=sal;
			String specialization="Engineering";
			System.out.println("Name: "+name+" Age: "+age+" Phonenumber: "+phonenumber+" Address: "+address+" Salary: "+sal);
		}
	}
	
	class Manager extends Member
	{
		
		 Manager(String na,int a,int pn,String add,int sal)
		{
			 System.out.println("Manager Details");
			 String name=na;
				int age=a;
				int phonenumber=pn;
				String address=add;
				int salary=sal;
				String department="Finance";
			    System.out.println("Name: "+name+" Age: "+age+" Phonenumber: "+phonenumber+" Address: "+address+" Salary: "+sal);

		}
	}
	
		
	

public class program61_salary {

	public static void main(String[] args)
	{
		Member m=new Member();
		
		Employee e=new Employee("Gokul", 20, 9895,"Newyork ciy,New York", 5000000);
		
		Manager n=new Manager("Ravi", 35, 979689,"kerala,India", 10000000);
		
	}

}
