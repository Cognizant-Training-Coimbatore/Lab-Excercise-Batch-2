package demo;
class Student
{
	String name;
	int roll_no;
	
}
public class program22a_class_student
{

	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.name="John";
		obj.roll_no=2;
		System.out.println("Name 	    : "+obj.name+"\nRoll Number : "+obj.roll_no);
		
	}

}
