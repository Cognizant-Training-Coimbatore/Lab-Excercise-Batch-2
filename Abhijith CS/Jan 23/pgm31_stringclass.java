class Student
{
	String name;
	int roll_no;
	void display()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}
}
public class pgm31_stringclass {

	public static void main(String[] args) 
	{
		Student st = new Student();
		st.name="John";
		st.roll_no=2;
		st.display();
	}

}
