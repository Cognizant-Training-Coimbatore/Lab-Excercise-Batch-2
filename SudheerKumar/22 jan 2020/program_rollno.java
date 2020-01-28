class student1
{
	int rollno;
	String phoneno;
	String address;
	String name;
}
public class program_rollno {

	public static void main(String[] args) {
		student1 obj=new student1();
		student1 obj1=new student1();
		obj.rollno=2;
		obj.name="sam";
		obj.phoneno="8919163456";
		obj.address="kurnool";
		obj1.rollno=3;
		obj1.name="john";
		obj1.phoneno="828123456";
		obj1.address="hyderabad";
		System.out.println(obj.rollno);
		System.out.println(obj.name);
		System.out.println(obj.phoneno);
		System.out.println(obj.address);
		System.out.println(obj1.rollno);
		System.out.println(obj1.name);
		System.out.println(obj1.phoneno);
		System.out.println(obj1.address);
		// TODO Auto-generated method stub

	}

}
