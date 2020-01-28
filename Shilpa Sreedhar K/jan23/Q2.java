class student1
{
	String name;
	int rollno;
	String phnno;
	String addrs;
	
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	student1 obj=new student1();
	student1 obj1=new student1();
	obj.name="Sam";
	obj.rollno=12;
	obj.addrs="Ernakulam";
	obj.phnno="1234567";
	obj1.name="john";
	obj1.rollno=15;
	obj1.addrs="trivandrum";
	obj1.phnno="126541";
	System.out.println(obj.name);
	System.out.println(obj.rollno);
	System.out.println(obj.addrs);
	System.out.println(obj.phnno);
	System.out.println(obj1.name);
	System.out.println(obj1.rollno);
	System.out.println(obj1.addrs);
	System.out.println(obj1.phnno);
	}

}
