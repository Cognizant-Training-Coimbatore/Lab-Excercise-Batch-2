class member
{
	String name, phone, address;
	int age, salary;
	void printSalary()
	{
		System.out.println(name + phone + address + age);
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
public class question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee obj = new employee();
		manager obj1 = new manager();
		obj.name="Parvathy";
		obj.phone="9072175526";
		obj.address="ABCD House 2";
		obj.age=22;
		obj.salary=23898;
		obj.specialization="Training";
		obj.printSalary();
		obj1.name="Padmanabhan";
		obj1.phone="97811175526";
		obj1.address="HHHJSNABCD House 2";
		obj1.age=54;
		obj1.salary=123898;
		obj1.department="HR";
		obj1.printSalary();
	}

}
