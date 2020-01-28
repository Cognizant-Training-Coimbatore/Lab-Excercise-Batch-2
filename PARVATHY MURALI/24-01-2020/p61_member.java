class member
{
	String name;
	int age;
	long phn;
	String address;
	float salary;
	void printSalary(String name, int age, long phn, String adress, int salary)
	{
		System.out.println("name"+name+" age "+age+" phone number "+phn+" adress "+address+" salary = "+salary);
	}
}
class Employee extends member
{
	String special;
	
}
class manager extends member
{
	String dept;
}
public class p61_member 
{

	public static void main(String[] args) 
	{
		Employee ob=new Employee();
		manager ob1=new manager();
		ob.printSalary("gini",30,999999999,"kochi",120000);
		ob1.printSalary("jeen",45,898989899,"chennai",35000000);

	}

}
