class student
{
	int roll_no;
	String name;
	void assign(int a , String b)
	{
		roll_no = a;
		name = b;
	}
}
public class exercise1_student_rollno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student();
		obj.assign(2,"john");
		System.out.println(obj.roll_no + "  " + obj.name);
	}

}
