class student
{
	String name;
	int rollno;
	void assign()
	{
		rollno=2;
		name="John";
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}
}
public class prog30_student {

	public static void main(String[] args) {
		student obj = new student();
		obj.assign();
        obj.display();
	}

}
