class student1
{
	String name;
	int roll_no;
	void assign(String x,int y)
	{
		name=x;
		roll_no=y;
		System.out.println(name);
		System.out.println(roll_no);
	}
}
public class student {

	public static void main(String[] args) 
	{
		student1 obj = new student1();
		obj.assign("John",2);
	}

}
