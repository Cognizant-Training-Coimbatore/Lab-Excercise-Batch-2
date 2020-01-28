class Student
{
	String name;
	int roll_no;
}
public class program32_class_name_student 
{

	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.name="John";
		obj.roll_no=2;
		System.out.println("The name is "+obj.name+" the roll_no is "+obj.roll_no);
	}

}
