class Member
{
	String name;
	int age;
	int phone_number;
	String address;
	int salary;
	void printSalary()
	{
		System.out.println("salary of employee:");
	}
}
class Employee extends Member

{
	String specialization;
	void display(String p,int q,int r,String s)
	{
		name=p;
		age=q;
		phone_number=r;
		address=s;
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone_number);
		System.out.println(address);
	}
	void printSalary(int sl)
	{
		salary=sl;
		System.out.println(salary);
	}
	
}
class Manager extends Member
{
	String dept;
	void display(String p,int q,int r,String s)
	{
		name=p;
		age=q;
		phone_number=r;
		address=s;
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone_number);
		System.out.println(address);
		
	}
	void printSalary(int sl)
	{
		salary=sl;
		System.out.println(salary);
	}
}

public class pgm64_member_printsalary {

	public static void main(String[] args) {
		//System.out.println("enter the name");
		
		Employee obj=new Employee();
		obj.display("nikhila",25,865448993,"kkjhsgdhd");
		obj.printSalary(20000);
		Manager ob=new Manager();
		ob.display("akhila",27,837637383,"kshdgshj");
		ob.printSalary(21000);

	}

}
