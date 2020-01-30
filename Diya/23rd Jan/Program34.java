import java.util.Scanner;

class Area
{
	int length,breadth;
	
	int returnArea(int l,int b)
	{
		int result;
		result=l*b;
		return result;
	}
}
public class Program34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		System.out.println("Enter the breadth");
		int breadth = sc.nextInt();
		Area obj = new Area();
		System.out.println("Area of the rectangle is " +obj.returnArea(length, breadth));
		
		

	}

}
