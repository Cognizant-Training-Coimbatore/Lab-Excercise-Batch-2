class student
{
	String name;
	int roll_no;
	void assign()
	{
		roll_no = 2;
		name = "john";
	}
	void display()
	{
		System.out.println(roll_no);
		System.out.println(name);
	}
}
public class example11_Q1 
{

	public static void main(String[] args) 
	{
		student obj = new student();
		obj.assign();
		obj.display();

	}

}
