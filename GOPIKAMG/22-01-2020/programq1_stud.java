class student
{
	String name;
	int roll_no;
	void assign(String name1,int roll_no1)
	{
		name=name1;
		roll_no=roll_no1;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}
}
public class programq1_stud {

	public static void main(String[] args)
	{
	student obj=new student();
	obj.assign("John",2);
	obj.display();

	}

}
