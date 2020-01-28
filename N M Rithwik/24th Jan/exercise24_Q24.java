class member
{
	String name;
	int age;
	String phnum;
	String addr;
	int salary;
	void printSalary()
	{
		System.out.println(name + phnum + addr + age);
		System.out.println(salary);
	}
}
class employee extends member
{
	String specialization;
}
class manager extends member
{
	String department;
}

public class exercise24_Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj = new employee();
		manager obj1 = new manager();
		obj.name="Rithwik";
		obj.phnum="8547423907";
		obj.addr="ABCD House 2";
		obj.age=22;
		obj.salary=63878;
		obj.specialization="Training";
		obj.printSalary();
		obj1.name="Venkat";
		obj1.phnum="97811175526";
		obj1.addr="DWVRGABCD House 2";
		obj1.age=50;
		obj1.salary=123456;
		obj1.department="HR";
		obj1.printSalary();
		
	}

}
