class member
{
	String name,addr;
	int age,phone,salary;
	void printSalary(int z)
	{
		salary=z;
		System.out.println(salary);
	}
}

class employee extends member
{
	String specialization;
	void display(String p,int q,int r, String s)
	{
		name=p;
		age=q;
		phone=r;
		addr=s;
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(addr);
	}
}

class manager extends member
{
	String dept;
	void display(String p,int q,int r, String s)
	{
		name=p;
		age=q;
		phone=r;
		addr=s;
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(addr);
	}
}
public class qu14 {

	public static void main(String[] args)
	{
		employee obj1 = new employee();
		manager obj2 = new manager();
		obj1.display("shaheen", 23, 960541, "ksd");
		obj1.printSalary(22000);
		obj2.display("anandu", 22, 223344, "kngd");
		obj2.printSalary(22000);

	}

}
