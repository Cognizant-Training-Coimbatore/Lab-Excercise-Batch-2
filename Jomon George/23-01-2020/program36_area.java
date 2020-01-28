import java.util.Scanner;

class Area
{
	void returnArea(int x,int y)
	{
		System.out.println("Area of rectangle: "+(x*y));
		
	}
}

public class program36_area
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Length=");
		int length=sc.nextInt();
		System.out.println("Breadth=");
		int breadth=sc.nextInt();
		Area ob=new Area();
		ob.returnArea(length, breadth);

	}

}
