class student
{
	String name;
	int roll_no;
	void assign()
	{
		name="john";
		
		roll_no=2;
	}
	
	void display()
	{
		System.out.println("name ="+name);
		System.out.println("Roll number ="+roll_no);
	}
}
public class program_student {

	public static void main(String[] args)
	{
		student obj = new student();
		
		obj.assign();
		obj.display();
	}

}
