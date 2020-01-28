class EmployeeDetails
{
public String empname="Alan";
private float empsalary=1234.34f;
void show()
{
System.out.print(empsalary);
}
}
public class DataAbstraction
{
public static void main (String args[])
{
EmployeeDetails obj=new EmployeeDetails();
System.out.println(obj.empname);
obj.show();
}
}
