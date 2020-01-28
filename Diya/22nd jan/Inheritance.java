class EmployeeDetails
{
String empName="Senthil";
float empsalary=12345.67f;
void displayName()
{
System.out.println("employee Name: "+empName);
}
void displaySalary()
{
System.out.println("employee Salary: "+empSalary);
}
}
class DeptDetails extends Employeedetails
{
String DeptName="sales";
int DeptCode=123;
void displayDept()
{
System.out.println("Department Name: "+deptName);
}
void displayCode()
{
System.out.println("Department Code: "+deptCode);
}
}
public class InheritanceDemo
{
public static void main(String a[])
{
deptDetails d1=new deptDetails();
d1.displayName();
d1.displaySalary();
d1.displayDept();
d1.displayCode();
}
}