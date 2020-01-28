package packB;
import packA.pg4_employee;
public class prg4_employeeout 
{
	
	public static void main(String[] args) 
	{
		pg4_employee  ob=new pg4_employee();
		ob.employee_input();
		System.out.println("Name: "+ob.name);
		System.out.println("Address: "+ob.address);
		System.out.println("Department: "+ob.dept);
		System.out.println("Salary: "+ob.salary);
		
		
		
		

	}

}
