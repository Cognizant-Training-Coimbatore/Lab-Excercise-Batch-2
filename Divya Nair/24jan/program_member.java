class member
{
	String Name,Address;
	int ph_no,age,Salary2;
	void printSalary()
	{
		
		Salary2=20000;
		System.out.println("Salary of members is:"+Salary2);
	}
	void display()
	{
		Name="divya";
		age=23;
		ph_no=1234;
		Address="Usha hostel";
		System.out.println("Name:"+Name);
		System.out.println("Age:"+age);
		System.out.println("Phone No:"+ph_no);
		System.out.println("Address:"+Address);
		
		
	}
	void show()
	{
		Name="diya";
		age=22;
		ph_no=5678;
		Address="Saravanampatti";
		System.out.println("Name:"+Name);
		System.out.println("Age:"+age);
		System.out.println("Phone No:"+ph_no);
		System.out.println("Address:"+Address);
	}
	
}
class Manager extends member
{
	String department="Testing";
	void all()
	{
		System.out.println("\nDetails of Manager-");
		display();
		System.out.println("Department:"+department);
		printSalary();
		
	}
}
class Employee extends member
{
	String specialisation="Java";
	void al()
	{
		System.out.println("\nDetails of Employee-");
		show();
		System.out.println("Specialisation:"+specialisation);
		printSalary();
		
	}
}
public class program_member {

	public static void main(String[] args)
	{
		Manager obj1=new Manager();
		obj1.all();
		
		Employee obj2=new Employee();
		obj2.al();
	}

}
