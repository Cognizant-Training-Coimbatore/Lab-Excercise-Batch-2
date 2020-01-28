import java.util.Scanner;

class Programming
{
	void food(String name)
	{
		System.out.println("i love "+name);
	}
	void food()
	{
		System.out.println("i love programming languages");
	}
}
public class q8 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ");
		String str=sc.nextLine();
		Programming obj = new Programming();
		obj.food();
		obj.food(str);
		
	}

}
