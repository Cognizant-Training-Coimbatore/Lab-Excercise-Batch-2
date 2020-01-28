class Student2
{
	String name;
	Student2()
	{
		System.out.println("Name:Unknown");
	}
	Student2(String n )
	{
		name=n;
		System.out.println("Name:" +name);
		
	}
	
}
public class program_Unknown {

	public static void main(String[] args) 
	{
		Student2 obj1=new Student2();
		Student2 obj2=new Student2("Divya");
		

	}

}
