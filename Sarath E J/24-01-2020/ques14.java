class member
{
	String name;
	int age;
	int number;
	String address;
	int salary;
	
	void printsalary()
	{
		System.out.println("Salary="+salary);
	}
}
class employee extends member
{
	String specialisation;
	String department;
	employee(String a,int n,int mob,String add,int sal)
	{
		name = a;
		age = n;
		number = mob;
		address = add;
		salary = sal;
	}
	void print()
	{	System.out.println("Employee");
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("mobile="+number);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		System.out.println("\n");
	}
}
class manager extends member
{
	String specialisation;
	String department;
	manager(String a,int n,int mob,String add,int sal)
	{
		name = a;
		age = n;
		number = mob;
		address = add;
		salary = sal;
	}
	void display()
	{	System.out.println("Manager");
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("mobile="+number);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			employee ob1 = new employee("sarath",22,343,"eloor",33);
			manager ob2 = new manager("dude",44,22,"hello",222);
			ob1.print();
			ob2.display();
			
	}

}
