class Member
{
	String name;
	int age,salary;
	long phone_number;
	String address;
	void printsalary()
	{
		System.out.println("Salary of the member :"+salary);
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phone_number);
		System.out.println("Address: "+address);
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
public class pgm4_hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1= new Employee();
		Manager obj2 = new Manager();
		obj1.name="John";
		obj1.age=25;
		obj1.phone_number=1234567879;
		obj1.address="Rose Garden";
		obj1.salary=10000;
		obj2.name="Samual";
		obj2.age=30;
		obj2.phone_number=1234567879;
		obj2.address="Rose Villa";
		obj2.salary=10000;
		obj1.display();
		obj1.printsalary();
		obj2.display();
		obj2.printsalary();
	}

}
