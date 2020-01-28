class member
{
	String name,addrs,phnno;
	int age;
	String salary;
	void printSalary()
	{
	System.out.println(salary);
	}
}
class employee extends member
{
	String specialization;
}
class manager extends member
{
	String department;
}
public class Qno_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member obj=new member();
		obj.name="Kiran";
		obj.age=24;
		obj.addrs="Cochin";
		obj.phnno="123456";
		obj.salary="51000";
		member obj2=new member();
		obj2.name="Arun";
		obj2.age=30;
		obj2.addrs="Trivandrum";
		obj2.phnno="123498";
		obj2.salary="67000";
		System.out.println("Employee name: " +obj.name);
		System.out.println("age: " +obj.age);
		System.out.println("Address: " +obj.addrs);
		System.out.println("phnnumber: " +obj.phnno);
		System.out.println("salary: " +obj.salary);
		System.out.println("manager name: " +obj2.name);
		System.out.println("age: " +obj2.age);
		System.out.println("Address: " +obj2.addrs);
		System.out.println("phnnumber: " +obj2.phnno);
		System.out.println("salary: " +obj2.salary);
		
	}

}
