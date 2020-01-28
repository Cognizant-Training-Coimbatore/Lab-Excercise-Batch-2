package Pack1;
import java.util.Scanner;

public class prog4_packA 
{
	Scanner sc=new Scanner(System.in);
	public String name;
	public String address;
	public String dept;
	public int salary;
	public void employee_input()
	{
	System.out.println("Enter name: ");
	name=sc.nextLine();
	System.out.println("Enter address: ");
	address=sc.nextLine();
	System.out.println("Enter department: ");
	dept=sc.nextLine();
	System.out.println("Enter salary: ");
	salary=sc.nextInt();

	}
}
