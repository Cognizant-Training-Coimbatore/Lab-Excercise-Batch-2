import java.lang.*;
import java.util.*;
class EmployeeDetails
{
public String empName="Senthil";
private float empSalary=12345.67f;
void show()
{
System.out.println("employee salary :"+empSalary);
}
}

public class DataAbstraction
{
public static void main(String a[])
{
EmployeeDetails e1=new EmployeeDetails();
System.out.println("employee name: "+e1.empName);
e1.show();
}}