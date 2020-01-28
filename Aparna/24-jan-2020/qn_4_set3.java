
package package2;
class Member
{
int age,salary;
String name,phone_no,address;
void printSalary()
{
System.out.println("The salary is.."+salary);
}
}
class Employee extends Member
{
String specialization;
}
class Manager extends Member
{
String department;
}
public class qn_4_set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee();
		Manager obj2=new Manager();
		obj1.name="parvati";
		obj2.name="pavitra";
		obj1.age=23;
		obj2.age=20;
		obj1.phone_no="12345678";
		obj2.phone_no="132147688";
		obj1.address="house1";
		obj2.address="house2";
		obj1.salary=10000;
		obj2.salary=20000;
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.phone_no);
		System.out.println(obj1.address);
		obj1.printSalary();
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		System.out.println(obj2.phone_no);
		System.out.println(obj2.address);
		obj2.printSalary();

		}

	}


