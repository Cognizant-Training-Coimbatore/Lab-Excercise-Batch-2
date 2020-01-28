import java.util.Scanner;

class student1
{
	student1(String a)
	{
		System.out.println(a);
	}
	student1()
	{
		System.out.println("unknown");
	}
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		student1 obj1=new student1(b);
		student1 obj2=new student1();
	}

}
