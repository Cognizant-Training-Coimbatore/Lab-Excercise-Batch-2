import java.util.Scanner;

class area
{
	int l;
	int b;
	int area1;
	void  assign(int x,int y)
	{
	 
	 l=x;
	 b=y;	
	 area1=l*b;

	}
	int  returnArea()
	{
		return area1;
		
	}
}
public class programq3_are {

	public static void main(String[] args)
	{
		System.out.println("Enter the length");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the breadth");
		int b=sc.nextInt();
		area obj=new area();
		obj.assign(a,b);
		obj.returnArea();
		System.out.println("area of a rectangle is:"+obj.returnArea());
				
		

	}

}
