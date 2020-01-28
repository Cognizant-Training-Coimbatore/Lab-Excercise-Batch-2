class Student
{
	String name;
	int rollno;
	Student()
	{
	String a=name;
	int b=rollno;
	}
	void display()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student roll no: "+rollno);
	}
}
public class program35_name_rollno 
{

	public static void main(String[] args) 
	{
		Student ob=new Student();
		ob.name="John";
		ob.rollno=2;
		ob.display();
		

	}

}
