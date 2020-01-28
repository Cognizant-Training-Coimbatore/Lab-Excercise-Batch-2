class EmployeeDetails
{
public String empName="Senthil";
private float empSalary=1234.65f;

void show()
{
System.out.println("empName+" "+empSalary);
}


}
}


public class DataAbstraction
{
public static void main(String a[])
{
EmployeeDetails e1=new EmployeeDetails();
e1.show();


}
}
