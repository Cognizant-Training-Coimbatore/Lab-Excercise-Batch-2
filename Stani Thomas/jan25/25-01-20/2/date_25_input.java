package packA;

import java.util.Scanner;

public class date_25_input {
	Scanner sc=new Scanner(System.in);
	public int s;
public String name,add,dep;
public void input()
{


	System.out.println("enter employee name" );
	name=sc.nextLine();
	System.out.println("enter employee address" );
	add=sc.nextLine();
	System.out.println("enter employee department" );
	add=sc.nextLine();
	System.out.println("enter employee salary" );
	s=sc.nextInt();
	
}
public void display()
{
	System.out.println(" employee name is "+name );
	
	System.out.println(" employee address is "+add );
	
	System.out.println(" employee department is  "+dep );
	
	System.out.println("employee salary is "+s );
}

}
