package day3;
class Member
{
	String Name,phone_number,address;
	int age,salary;
	void printSalary()
	{
		System.out.println("Salary :"+salary);
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
public class Q14_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee();
		Manager obj2=new Manager();
		obj1.Name="Jishnu";
		obj1.age=25;
		obj1.phone_number="9400914639";
		obj1.address="Kanamdathil House, Kannur";
		obj1.salary=2000;
		obj2.Name="Vishnu";
		obj2.age=29;
		obj2.phone_number="9499914639";
		obj2.address="Memanamdathil House, Kannur";
		obj2.salary=20000;
		System.out.println("Employee");
		System.out.println("Name: "+obj1.Name);
		System.out.println("Age: "+obj1.age);
		System.out.println("phone number: "+ obj1.phone_number);
		System.out.println("Address: "+obj1.address);
		System.out.println("Salary "+obj1.salary);
		System.out.println("Manager");
		System.out.println("Name: "+obj2.Name);
		System.out.println("Age: "+obj2.age);
		System.out.println("phone number: "+ obj2.phone_number);
		System.out.println("Address: "+obj2.address);
		System.out.println("Salary "+obj2.salary);
		

	}

}
