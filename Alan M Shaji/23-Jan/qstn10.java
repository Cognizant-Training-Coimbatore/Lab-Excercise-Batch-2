import java.util.Scanner;

class Areaa
{
	double a;
	double area(double a)
	{
		return a*a;
	}
	double area(double l,double b)
	{
		return l*b;
	}
}
public class qstn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areaa obj=new Areaa();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter side of sqaure\t:\t");
		double a=sc.nextDouble();
		System.out.println("Area of Square\t:\t"+obj.area(a));
		System.out.print("enter length and breadth of rectangle\t:\t");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("Area of Rectangle\t:\t"+obj.area(l,b));
		sc.close();

	}

}
