class student
{
	String name;
	int rollno;
	void assign()
	{
		name ="john";
		rollno = 2;
		
		
	}
	void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		
	}
	
}
public class program39_stud 
{

	public static void main(String[] args)
	{
		student obj = new student();
	
		obj.assign();
		obj.display();
		// TODO Auto-generated method stub

	}

}
