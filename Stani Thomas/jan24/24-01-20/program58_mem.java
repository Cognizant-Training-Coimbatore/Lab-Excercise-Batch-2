import java.util.Scanner;

class member
{
	String name,add;
	int age,sal;
	long ph;
	void printsalary() {
		System.out.println("salary = "+sal);
	}
	
}
class employee extends member
{
	String sp,dep;
}
class manager extends member
{
	String sp,dep;
}
public class program58_mem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
employee obj1=new employee();
manager obj2=new manager();
System.out.println("enter employee name");
obj1.name=sc.nextLine();
System.out.println("enter age of employee");
obj1.age=sc.nextInt();
System.out.println("enter phone number of emp");
obj1.ph=sc.nextInt();
System.out.println("enter address of emp");
obj1.add=sc.nextLine();
System.out.println("enter salary of emp");
obj1.sal=sc.nextInt();
System.out.println("enter manager name");
obj2.name=sc.nextLine();
System.out.println("enter age of manager");
obj2.age=sc.nextInt();
System.out.println("enter phone number of manager");
obj2.ph=sc.nextInt();
System.out.println("enter address of manager");
obj2.add=sc.nextLine();
System.out.println("enter salary of manager");
obj2.sal=sc.nextInt();


	}

}
