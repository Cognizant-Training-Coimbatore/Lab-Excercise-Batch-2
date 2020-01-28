package packA;

public class classD {
	
	String name,address,department;
	int salary;
	
	protected void assign (String n,String addr,String dept, int sal)
	{
		name = n;
		address =addr;
		department = dept;
		salary =sal;
	}
	protected void show()
	{
		System.out.println("Name : " + name + " Address : " + address + " department : " + department + " Salary : " + salary);
	}

}