class EmployeeDetails
{
String empname="Alan";
float empsalary=1234.34f;
void show()
{
System.out.print(empname);
}
void showSal()
{
System.out.print(empsalary);
}
}

class Deptdetails extends DataAbstraction
{
String deptName="sales";
int deptcode=1234;

void displayDept()
{
System.out.println(deptName);
}
void displaycode()
{
System.out.println(deptcode);
}
}
public class inheritance
{
public static void main (String args[])
{
Deptdetails obj=new Deptdetails();
obj.show();
obj.showSal();
obj.displayDept();
obj.displaycode();
}
}
