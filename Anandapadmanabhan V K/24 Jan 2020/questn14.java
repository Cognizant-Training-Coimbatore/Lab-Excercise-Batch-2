class member
{
	String name;
	int age;
	int phone;
	String address;
	int salary;
	
	void printSalary(int s)
	{
		salary=s;
		System.out.println(salary);
	}
}
class employee extends member
{
	String specialization;
	void display(String n,int a,int p,String ad)
	{
		name=n;
		age=a;
		phone=p;
		address=ad;
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
	}
}
class manager extends member
{
	String department;
	void display(String n,int a,int p,String ad)
	{

		name=n;
		age=a;
		phone=p;
		address=ad;
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
	}	
}
public class questn14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj=new employee();
		manager obj1=new manager();
		obj.display("anandu", 22,9999999 , "ksd");
		obj1.display("Shaheen", 22, 999999, "ksd");
		obj1.printSalary(22000);
		
	}

}
