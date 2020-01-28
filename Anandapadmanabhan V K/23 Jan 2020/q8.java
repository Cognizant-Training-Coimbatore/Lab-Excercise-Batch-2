import java.util.Scanner;

class programming
{
	String str;
	void ex(String str)
	{
		System.out.println("I love " + str);
	}
	void ex2()
	{
		System.out.println("I love programming");
	}
}
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		programming obj=new programming();
		obj.ex(a);
		obj.ex2();

	}

}
