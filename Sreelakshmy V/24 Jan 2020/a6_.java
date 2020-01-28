import java.util.Scanner;

class Student
{

	Student()
	{
		System.out.println("Unknown");
	}
	

	Student(String s)
	{
		System.out.println("Name="+s);
	}
}
public class a6_ {

	public static void main(String[] args) {
		String z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		z=sc.nextLine();
		if(z==null)
		{
		Student ob=new Student();
		System.exit(0);
		}
		Student obj=new Student(z);
	
	

	

}
}