class Student
{
	String name;
	int roll_no;
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll_no);
	}
}
public class program34_work1 {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.name="John";
		obj.roll_no=2;
		obj.display();
		
	}

}
