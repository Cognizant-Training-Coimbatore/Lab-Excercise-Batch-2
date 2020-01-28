package packA;

import java.util.Scanner;

public class qstn__04 {
	String Name;
	String Address;
	String Department;
	Double Salary;
	String Project;
	static int i=1;
	static int j=1;
	public void get()
	{
		Scanner sc= new Scanner(System.in);
		Scanner s= new Scanner(System.in);
		System.out.println("Employee "+i);
		System.out.print("enter Name-->");
		Name=sc.next();
		System.out.print("enter Address-->");
		Address=s.nextLine();
		System.out.print("enter Department-->");
		Department=sc.next();
		System.out.print("enter Salary-->");
		Salary=sc.nextDouble();
		System.out.print("enter Project-->");
		Project=sc.next();
		i++;
	}
	public void display()
	{
		System.out.println("Employee "+j);
		System.out.println("Name-->"+Name);
		System.out.println("Address-->"+Address);
		System.out.println("Department-->"+Department);
		System.out.println("Salary-->"+Salary);
		System.out.println("Project-->"+Project);
		j++;

	}

}
