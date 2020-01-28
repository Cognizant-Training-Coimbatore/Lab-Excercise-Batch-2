import java.util.Scanner;

class st6
{
	void stud(String name)
	{
		System.out.println(name);
	}
	void stud()
	{
		System.out.println("Unknown");
	}
}
public class q6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String str=sc.nextLine();
		st6 obj = new st6();
		obj.stud();
		obj.stud("John");
		
	}

}
