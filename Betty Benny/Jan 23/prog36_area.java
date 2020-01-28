import java.util.Scanner;

class area
{
	int l,b;
	int returnarea(int a,int y)
	{
	int area1=a*y;
	return area1;
	}
	
	
}

public class prog36_area {

	public static void main(String[] args)
	{
		System.out.println("Enter length and breadth:");
		Scanner s=new Scanner(System.in);
		
		area obj=new area();
		obj.l=s.nextInt();
		obj.b=s.nextInt();
		int a1=obj.returnarea(obj.l,obj.b);
		
		System.out.println("Area is:" +a1);
		
		
				
		
		
		// TODO Auto-generated method stub

	}

}
