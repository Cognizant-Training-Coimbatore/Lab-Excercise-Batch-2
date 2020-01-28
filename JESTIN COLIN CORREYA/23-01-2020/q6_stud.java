package demo;
class student
{
	String name;
	student()
	{
		name="unknown";
		System.out.println("name:"+name);
	}
	student(String a)
	{
		name=a;
		System.out.println("name:"+name);
	}
	
}
public class q6_stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student obj=new student();
student obj2=new student("sam");
	}

}
