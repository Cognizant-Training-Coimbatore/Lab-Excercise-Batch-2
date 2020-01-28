class student
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
public class q1_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student();
		obj.assign("John", 2);
	}

}
