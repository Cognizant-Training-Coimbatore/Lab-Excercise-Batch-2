class member
{
	String name;
	int age;
	String phoneno;
	String address;
	double salary;
	void print_salary(double sa)
	{
		System.out.println("salary: "+sa);
	}
}	
	class employee extends member
	{
	 String specialisation;	
	 
	 employee(String n,int a,String p,String ad,double sal)
	 {
		 name=n;
		 age=a;
		 phoneno=p;
		 address=ad;
		 salary=sal;
		 
		 System.out.println("name of employee: " +name);
		 System.out.println("age of employee: " +age);
		 System.out.println("phone no of employee: " +phoneno);
		 System.out.println("address of employee: " +address);
		 print_salary(salary);
	 
	 }
	}
	class manager extends member
	{
		String department; 
		 manager(String n,int a,String p,String ad,double sal)
		 {
			 name=n;
			 age=a;
			 phoneno=p;
			 address=ad;
			 salary=sal;
			 
			 System.out.println("name of manager: " +name);
			 System.out.println("age of manager: " +age);
			 System.out.println("phone no of manager: " +phoneno);
			 System.out.println("address of manager: " +address);
			 print_salary(salary);
			 
		 
		 }
	}
public class prog_66_member {

	public static void main(String[] args)
	{
		employee obj1 = new employee("mariya",23,"8301904497","chennai",25000);
	    manager obj2 = new manager("eldho",45,"9447474497","kochi",120000);
		
	}

}
