class students
{
	String name;
	students()
	{
		name="Unknown";
	}
	students(String a)
	{
		name=a;
	}
	void display()
	{
		System.out.println("Name: "+name);
	}
}
public class example15_Q5 

{

	public static void main(String[] args) 
	{
		students obj1 = new students();
		students obj2 = new students("simna");
		obj1.display();
		obj2.display();

	}

}
