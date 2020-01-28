import java.util.Scanner;

class area
{
	int l,b;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		 l= sc.nextInt();
		 b= sc.nextInt();
	}
	int returnArea()
	{
		return l*b;
	}
}
public class area31 {

	public static void main(String[] args)
	{
		area obj = new area();
		System.out.println("Enter length and breadth:");
		obj.read();
		System.out.println("Area="+obj.returnArea());

	}
}
