class student_s
{
	String name;
	student_s()
	{
		name="Unknown name";
		System.out.println(name);
	}
	student_s(String s)
	{
		name=s;
		System.out.println(name);
	}
}
public class Q5_String_handler {

	public static void main(String[] args) {
		student_s obj1=new student_s();
		student_s obj2=new student_s("Anjana");
		
	}

}
