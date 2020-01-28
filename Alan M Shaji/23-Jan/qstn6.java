class Student2
{
	String name;
	Student2()
	{
		name="Unknown";
		System.out.println(name);
	}
	Student2(String n)
	{
		name=n;
		System.out.println(name);
	}
}
public class qstn6 {

	public static void main(String args[])
	{
		Student2 obj=new Student2();
		Student2 obj1=new Student2("Sam");

	}
}
