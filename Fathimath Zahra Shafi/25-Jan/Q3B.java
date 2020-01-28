package packTwo;
import packOne.Q3A;
public class Q3B extends Q3A {

	String name;
	int age;
	
	void emp_details(String name,int age,double sa)
	{
		System.out.println("name: "+name);
		System.out.println("age: " +age);
		
		 printSalary(sa);
		
	}
	
	
	public static void main(String[] args)
	{
		Q3B obj=new Q3B();
		obj.emp_details("john", 34, 25000);
	}
	
	
}
