package demo;
class Member
{
	String name;
	int age;
	String ph;
	String add;
	int sal;
	void printsalary()
	{
		System.out.println("salary:"+sal);
	}
}
class employee extends Member
{
	String specialization="java";
	String department="testing";
	void display(String n,int a,String ph,String ad,int s)
	{
		System.out.println("employee details");
		System.out.println("age:"+a);
		System.out.println("phone:"+ph);
		System.out.println("address:"+ad);
		System.out.println("salary:"+sal);
		System.out.println("specialization:"+specialization);
		System.out.println("department:"+department);
		
	}
}
class manager extends Member
{
	String specialization;
	String department;
	void display(String n,int a,String ph,String ad,int s)
	{
		System.out.println("\n\n");
		System.out.println("MANAGER details");
		System.out.println("age:"+a);
		System.out.println("phone:"+ph);
		System.out.println("address:"+ad);
		System.out.println("salary:"+sal);
		System.out.println("specialization:"+specialization);
		System.out.println("department:"+department);
		
	}
	
}

public class program_Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee();
		e1.display("ARJUN", 34, "8764956932", "afgsfagff,agfsahgdf,kerala,india", 40000);
		manager mr=new manager();
		mr.display("JOHN", 45, "98556047355", "sfgfsftgsg,jdhjfhjf,kerala,india", 60000);
}
}