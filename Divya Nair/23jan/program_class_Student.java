class Student
{
	String name;
	int roll_no;
	
	void display()
	{
		name="John";
		roll_no=2;
		System.out.println("Name:"+name);
		System.out.println("RollNo:"+roll_no);
	}
	
}
public class program_class_Student {

	public static void main(String[] args)
	{
		
		Student obj=new Student();
		obj.display();


	}

}
