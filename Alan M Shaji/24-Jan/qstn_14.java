import java.util.Scanner;

class Member
{
	String Name;
	int Age;
	String Phone_Number;
	String Address;
	Double Salary;
	void Print_Salary()
	{
		System.out.println("Salary\t:\t"+Salary);
	}
}
class Employee extends Member
{
	String Specialization;
	String Department;
	void display()
	{
		System.out.println("Employee name\t:\t"+Name);
		System.out.println(Name+"'s Age\t:\t"+Age);
		System.out.println(Name+"'s Phone Number\t:\t"+Phone_Number);
		System.out.println(Name+"'s Salary\t:\t"+Salary);
		System.out.println(Name+"'s Specialization\t:\t"+Specialization);
	}
}
class Manager extends Member
{
	String Specialization;
	String Department;
	void display()
	{
		System.out.println("Manager name\t:\t"+Name);
		System.out.println(Name+"'s Age\t:\t"+Age);
		System.out.println(Name+"'s Phone Number\t:\t"+Phone_Number);
		System.out.println(Name+"'s Salary\t:\t"+Salary);
		System.out.println(Name+"'s Specialization\t:\t"+Specialization);
	}
}
public class qstn_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj =new Employee();
		Manager obj1= new Manager();
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter employee name\t:\t");
		obj.Name=s.nextLine();
		System.out.print("Enter employee Age\t:\t");
		obj.Age=sc.nextInt();
		System.out.print("Enter employee Phone Number\t:\t");
		obj.Phone_Number=sc.next();
		System.out.print("Enter employee Address\t:\t");
		obj.Address=s.nextLine();
		System.out.print("Enter employee Salary\t:\t");
		obj.Salary=sc.nextDouble();
		System.out.print("Enter employee Specialization\t:\t");
		obj.Specialization=s.nextLine();
		System.out.print("Enter employee Department\t:\t");
		obj.Department=sc.next();
		obj.display();
		System.out.print("Enter Manager name\t:\t");
		obj1.Name=s.nextLine();
		System.out.print("Enter Manager Age\t:\t");
		obj1.Age=sc.nextInt();
		System.out.print("Enter Manager Phone Number\t:\t");
		obj1.Phone_Number=sc.next();
		System.out.print("Enter Manager Address\t:\t");
		obj1.Address=s.nextLine();
		System.out.print("Enter Manager Salary\t:\t");
		obj1.Salary=sc.nextDouble();
		System.out.print("Enter Manager Specialization\t:\t");
		obj1.Specialization=s.nextLine();
		System.out.print("Enter Manager Department\t:\t");
		obj1.Department=sc.next();
		obj1.display();
	}

}
