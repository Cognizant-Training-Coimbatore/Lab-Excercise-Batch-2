class Student
{
	String name;
	int rollnum;
	void display()
	{
		System.out.println(rollnum + name);
	}
}
public class question1 {

	public static void main(String[] args) {
		Student obj= new Student();
		obj.name="John";
		obj.rollnum=2;
		obj.display();

	}

}
