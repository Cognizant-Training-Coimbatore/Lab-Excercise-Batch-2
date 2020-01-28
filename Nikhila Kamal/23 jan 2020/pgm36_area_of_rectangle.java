import java.util.Scanner;

class Area
{
	int length,breadth,area;
	Area(int a,int b)
	{
		length=a;
		breadth=b;
		
	}
	void returnarea()
	{
		System.out.println(length*breadth);
	}
}
public class pgm36_area_of_rectangle {

	public static void main(String[] args) 
	{
		System.out.println("enter the length");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		System.out.println("enter the breadth");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		Area obj=new Area(l,b);
		obj.returnarea();
		

	}

}
