import java.util.Scanner;

class Area
{
	int return_area(int length,int breadth)
	{
		return length*breadth;
	}
}
public class pgm33_area {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Area ar = new Area();
		int l,b;
		System.out.println("Enter the length of the rectangle: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle: ");
		b = sc.nextInt();
		System.out.println("Area of the rectangle: "+ar.return_area(l,b));
		sc.close();
	}

}
