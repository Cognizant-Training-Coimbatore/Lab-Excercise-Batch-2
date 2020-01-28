class student1
{
	String name;
	
	student1()
	{
		name="unknown";
		System.out.println(name);
	}
	
	student1(String s)
	{
		name=s;
		System.out.println(name);
	}
	
	
}
public class stud33 {

	public static void main(String[] args) 
	{
		student1 obj1 = new student1();
		student1 obj2 = new student1("Sarath");
		student1 obj3 = new student1("freak");
		
		
		
	}

}

