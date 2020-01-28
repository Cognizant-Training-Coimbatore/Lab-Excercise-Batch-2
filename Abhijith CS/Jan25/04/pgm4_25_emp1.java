package packB;
import packA.pgm4_25emp;
public class pgm4_25_emp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pgm4_25emp obj = new pgm4_25emp();
		String nam=obj.inputname();
		String add=obj.inputadd();
		String dept=obj.inputdept();
		int age=obj.inputage();
		int salary=obj.inputsal();
		System.out.println("Name: "+nam);
		System.out.println("Address: "+add);
		System.out.println("Department: "+dept);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}

}
