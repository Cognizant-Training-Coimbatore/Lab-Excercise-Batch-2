import java.util.Scanner;

class area
{
	
	 int area1(int c,int d)
	{
		
		return c*d;	
	}
	 
}
public class example13_Q3 
{

	public static void main(String[] args) 
	{
		area obj = new area();
		int x,y,arr;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the lenght: ");
		x = scanner.nextInt();
		System.out.println("enter the breadth: ");
		y = scanner.nextInt();
	    arr=obj.area1(x,y);
	    System.out.println("Area of the rectangle: "+arr);

	}

}
