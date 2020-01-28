package packA;

import java.util.Scanner;

public class pgm4_25emp {
	int age,salary;
	String name,address,department;
	Scanner sc = new Scanner(System.in);
	public String inputname()
	{
		name=sc.nextLine();
		return name;
	}
	public String inputadd()
	{
		address=sc.nextLine();
		return address;
	}
	public String inputdept()
	{
		department=sc.nextLine();
		return department;
	}
	public int inputage()
	{
		age=sc.nextInt();
		return age;
	}
	public int inputsal()
	{
		salary=sc.nextInt();
		return salary;
	}
}
