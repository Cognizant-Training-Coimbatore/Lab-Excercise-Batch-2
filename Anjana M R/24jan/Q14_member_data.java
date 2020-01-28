
class member
{ 
	
	String name,phone_number,Address;
	int age,Salary;
	

	void print_salary()
	{
		System.out.println(Salary);
	}
}
class Employee extends member
{
	String specialization;
	String department;
	void display1()
	{
		System.out.println(specialization + department);
	}
	
}
class Manager extends member
{
	String specialization;
	String department;
	void display2()
	{
		System.out.println(specialization + department);
	}
}
public class Q14_member_data {

	public static void main(String[] args) {
		member obj=new member();
		obj.name="Anjana";
		obj.phone_number="2789929200";
		obj.Address="House";
		obj.age=21;
		obj.Salary=20000;
		
		
		
		Employee obj1=new Employee();
		obj1.specialization="software";
		obj1.department="comp";
		Manager obj2=new Manager();
		obj2.specialization="hardwre";
		obj2.department="comp";
		obj.print_salary();
		
	
		obj1.display1();
		obj2.display2();
		
		
	}

}
