class Member
{
	String name;
	int age;
	long phno;
	String addr;
	Double sal;
	
	void printSal()
	{
		System.out.println(sal);
	}
	
}
class Emp extends Member
{
	String specialization;
	void display(String n,int a,long p,String adr,Double s)
	{
		System.out.println("Employee : ");
		System.out.println(n);
		System.out.println(a);
		System.out.println(p);
		System.out.println(adr);
		System.out.println(s);
	}
	
}
class Manager extends Member
{
	String dept;
	void display(String n,int a,long p,String adr,Double s)
	{
		System.out.println("Manager : ");
		System.out.println(n);
		System.out.println(a);
		System.out.println(p);
		System.out.println(adr);
		System.out.println(s);
	}
}
public class program63_lab14_classmember {

	public static void main(String[] args) {
		Emp ob=new Emp();
		Manager obj=new Manager();
		ob.display("Sudeer", 35, 986543211, "adr", 50000.00);
		obj.display("Gopu", 45, 984858776, "adr", 100000.00);
		

	}

}
