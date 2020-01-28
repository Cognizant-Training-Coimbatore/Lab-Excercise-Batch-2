class Student
{
	String address;
	int roll_no;
	int ph_no;
	public Student() {
		// TODO Auto-generated constructor stub
	this(" ",0 ,0);
	}
 Student(String faddress,int froll_no,int fph_no)
 {
	 address = faddress;
	 roll_no = froll_no;
	 ph_no = fph_no;
 }
}
public class class1_q2 {

	public static void main(String[] args) {
 System.out.println("The details of Sam is as follows : ");
 Student obj1 = new Student("addr1",1,23);
 System.out.println(obj1.address + obj1.ph_no + obj1.roll_no);
 System.out.println("The details of Sam is as follows : ");
 Student obj2 = new Student("addr1",1,23);
 System.out.println(obj2.address + obj2.ph_no + obj2.roll_no);
 
	}

}
