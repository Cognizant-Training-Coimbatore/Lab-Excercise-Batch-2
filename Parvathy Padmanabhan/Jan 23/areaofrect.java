import java.util.Scanner;
class Area
{
	int returnArea(int length, int breadth)
	{
		int area=length*breadth;
		return area;
	}
}
public class areaofrect {
	public static void main(String args[])
	{
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length: ");
		a=input.nextInt();
		System.out.println("Enter breadth: ");
		b=input.nextInt();
		Area obj = new Area();
		int result = obj.returnArea(a, b);
		System.out.println(result);
		input.close();
	}
}
