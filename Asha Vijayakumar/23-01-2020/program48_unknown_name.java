class student1
{
	String name;
	student1()
	{
		System.out.println("Name: unknown");
		
	}
	student1(String p)
	{
		name=p;
		
		
		System.out.println("Name:" + name);
		
	}
}
public class program48_unknown_name {

	public static void main(String[] args)
	{
		student1 obj1 = new student1();
		student1 obj2 = new student1("aruna");
		// TODO Auto-generated method stub

	}

}
