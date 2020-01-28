class EmployeeDetails
{
String empName="Senthil";
float empSalary=12345.67f;

void displayName()
{
System.out.println("Employee Name:  "+empName);
}
void displaySalary()
{

  System.out.println("Employee Salary: "+empSalary);

}
}
class DeptDetails extends EmployeeDetails
{
String deptName+"Sales";
int deptCode=123;

void displayCode()
{
System.out.println("Department Code: "+deptCode);
}

}
public class InheritanceDemo
{
public static void main(Striing a[])
{
DeptDetails d1=new DeptDetails();
d1.displayname();
d1.displaySalary();
d1.displayDept();
d1.displayCode();

/*System.out.println("Employee Name: "+e1.empName);
System.out.println("EmployeeSalary "+e1.empSalary);
*/
}
}

