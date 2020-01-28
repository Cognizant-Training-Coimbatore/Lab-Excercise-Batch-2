import java.util.Scanner;

class Area
{
	int length,breadth;
	
	public Area(int l,int b) //Parametrized constructor
	{
		length=l;
		breadth=b;
	}
	public int findArea()
	{
		
		return length*breadth;
	}
	
	
}
public class program34_area_of_rectangle {

	public static void main(String[] args) {
		int l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle..");
		l=sc.nextInt();
		System.out.println("Enter value of breadth of rectangle..");
		b=sc.nextInt();
		Area ar=new Area(l,b); //in prev q a datatype of class was used.here a fn inside class Area is called using object ar
		System.out.println("Area of rectangle is: "+ar.findArea());
		}

	}


