class member{
	String name;
	int age;
	String ph_no;
	String add;
	int salary;
	
	void printSalary() {
		System.out.println(salary);
	}
}
class employee extends member{
	String spec;
}
class manager extends member{
	String dep;
}
public class qtn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         employee e =new employee();
         manager m=new manager();
         e.name="xy";
         m.name="xz";
         e.age=22;
         m.age=23;
         e.ph_no="9446160244";
         m.ph_no="9446160288";
         e.add="bla,blabla";
         m.add="bla,blblabla";
         e.salary=200000;
         m.salary=300000;
         System.out.println(e.name);
         System.out.println(e.age);
         System.out.println(e.ph_no);
         System.out.println(e.add);
         System.out.println(e.salary);
         System.out.println(m.name);
         System.out.println(m.age);
         System.out.println(m.ph_no);
         System.out.println(m.add);
         System.out.println(m.salary);
	}

}
