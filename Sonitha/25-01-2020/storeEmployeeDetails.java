package j25_q4_pack1_store;

import java.util.Scanner;

public class storeEmployeeDetails {
 public String[] name = new String[5];
  public String[] address = new String[5];
  public String[] department = new String[5];
  public long[] salary = new long[5];

	Scanner sc =new Scanner(System.in);
	{
		System.out.println("Enter the details of 5 employees");
	for(int i=0;i<5;i++) 
	{
		System.out.println("Name");name[i] = sc.next();
		System.out.println("address");address[i] = sc.next();
		System.out.println("Department");department[i] = sc.next();
		System.out.println("Salary");salary[i] = sc.nextInt();
		
	}


}
	}