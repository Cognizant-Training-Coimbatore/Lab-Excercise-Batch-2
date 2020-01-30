class Member
{
	String Name, Phone_number, Address;
	int Age, Salary;
	void printSalary()
	{
		System.out.println("Salary is " +Salary);
	}
	void display()
	{
		System.out.println("Name: " +Name);
		System.out.println("Phone_number: " +Phone_number);
		System.out.println("Address: " +Address);
		System.out.println("Age: " +Age);
		System.out.println("Salary: " +Salary);
	}
}
class Employee extends Member
{
	String Specialization;
}
class Manager extends Member
{
	String Department;
}
public class Program61 {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.Name="Diya";
		obj1.Phone_number="9496768926";
		obj1.Address="hfcgh\ngfvhb\nffvg\ngfvf";
		obj1.Age=23;
		obj1.Salary=20000;
		obj1.display();
		Manager obj2 = new Manager();
		obj2.Name="Diya1";
		obj2.Phone_number="9496768925";
		obj2.Address="hfcgh\ngfvhb\nffvg\nhgytf";
		obj2.Age=24;
		obj2.Salary=25000;
		obj2.display();


	}

}
