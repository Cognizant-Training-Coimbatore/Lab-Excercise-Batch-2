package demo;

import java.util.Scanner;

/*Question 4
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee'
 and 'Manager' classes have data members 'specialization' and 'department'
  respectively. Now, assign name, age, phone number, address and salary to an 
  employee and a manager by making an object of both of these classes and print
   the same.
*/
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
public class program_28_d_member 
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
