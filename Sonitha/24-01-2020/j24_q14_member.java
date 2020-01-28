class member{
	String name;
	int age;
	long mobile;
	String address;
	long salary;
	void printSalary() {
		System.out.println("Rs."+salary);
	}
	
}
class Employee extends member {
	String specialization;
	
}
class Manager extends member{

	String department;
}
public class j24_q14_member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ob1 =new Manager();
		Employee ob2 = new Employee();
		ob1.name = "Name1";
		ob1.age = 22;
		ob1.mobile = 11223344;
		ob1.address ="address1";
		ob1.salary = 11233455;
		ob1.department="department1";
		ob2.name = "Name2";
		ob2.age = 11;
		ob2.mobile = 111223344;
		ob2.address ="address2";
		ob2.salary = 54656455;
		ob2.specialization ="specialization";
		System.out.println("The details of the manager is : " +"\n"+ ob1.name +"\n" + ob1.age +"\n"+ob1.mobile+"\n"+ob1.address+"\n"+ob1.department);
		ob1.printSalary();
		System.out.println("\n");
		System.out.println("The details of the employee is : " +"\n"+ ob2.name +"\n" + ob2.age +"\n"+ob2.mobile+"\n"+ob2.address+"\n"+ob2.specialization);
		ob1.printSalary();

	}

}
