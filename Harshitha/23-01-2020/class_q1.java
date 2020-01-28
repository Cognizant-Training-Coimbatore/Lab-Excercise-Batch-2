class Student
{
	String name="";
	int roll_no;
	void assign(String n ,int r)
	{
		name =n;
		roll_no = r;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}
}
public class class_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student obj =new Student();
      obj.assign("John",2);
      obj.display();
	}

}
