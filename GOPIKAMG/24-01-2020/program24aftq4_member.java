class Member
{
	String Name;
	int Age;
	long Phone_number;
	String Address;
	int Salary;
	
	void display(String Name,int Age,long Phone_number,String Address,int Salary )
	{
		System.out.println("name : " +Name+ " "+ "Age" +Age+" "+ "Phone_number : " +Phone_number+ " "+ "Address :" +Address+" "+ "Salary: "+Salary);
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
public class program24aftq4_member {

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.display("gopika",22,987875787,"tvpm",20000);
		Manager m=new Manager();
		m.display("gopi", 28, 786757809, "kochi", 67855);

	}

}
