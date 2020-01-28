import java.util.Scanner;

class area11
{
	area(double a,double b)
	{
		return(a*b);
	}
	area(double a)
	{
		return(a*a);
	}
}
public class a_10 {

	public static void main(String[] args)
	{
		double x,y,z,c,d;
		area11 ob=new area11();
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter len and breadth");
		x=sc.nextDouble();
		y=sc.nextDouble();
		  System.out.println("Enter square side");
		  z=sc.nextDouble();
		  c=ob.area(x,y);
		  d=ob.area(z);
		  System.out.print(c,d);
	}

}
