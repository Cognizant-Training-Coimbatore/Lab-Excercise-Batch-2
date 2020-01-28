import java.util.Scanner;

class area
{
	int l,b;
	int returnarea()
	{
		int a=l*b;
		return(a);
	}
}
public class question3 {

	public static void main(String[] args)
	{ 	
		int length,breadth;
		System.out.println("enter length and breadth");
		Scanner sc= new Scanner(System.in);
		length=sc.nextInt();
		breadth=sc.nextInt();
		area obj=new area();
		obj.l=length;
		obj.b=breadth;
		System.out.println("area is"+obj.returnarea());
		
		
		
		
		
	}

}
