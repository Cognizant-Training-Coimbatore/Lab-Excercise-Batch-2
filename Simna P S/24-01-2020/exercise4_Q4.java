import java.util.Scanner;
class Member
{
String Name,Ph_no,Address;
int Age;
double Salary;
void printSalary()
{
System.out.println("Salary : Rs."+Salary);
}
void enter()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the Member");
Name=sc.next();
System.out.println("Enter Phone Number");
Ph_no=sc.next();
System.out.println("Enter Address");
Address=sc.next();
System.out.println("Enter the age");
Age=sc.nextInt();
System.out.println("Enter the Salary");
Salary=sc.nextDouble();
}
void display()
{

System.out.println("Name of the Member : "+Name);

System.out.println("Phone Number : "+Ph_no);

System.out.println("Address : "+Address);

System.out.println("Age : "+Age);

System.out.println("Salary : "+Salary);

}
}
class Employee extends Member
{
String specialization;

}
class Manager extends Member
{
String specialization;


}

public class exercise4_Q4 
{

	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		Manager mng=new Manager();
		System.out.println("Enter details of Employee : ");
		emp.enter();
		System.out.println("Enter details of Manager : ");
		mng.enter();
		System.out.println("Details of Employee : ");
		emp.display();
		System.out.println("Details of Manager : ");

		mng.display();

	}

}
