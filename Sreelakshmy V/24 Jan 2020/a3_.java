import java.util.Scanner;

class Area
{
	
	double returnArea(double a, double b)
	{
		return(a*b);
	}
}
public class a3_ {

	public static void main(String[] args) {
		double p,q,c;
		Area ob=new Area();
		System.out.println("Enter length and breadth");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();
		c=ob.returnArea(p,q);
		System.out.println("Area="+c);
	}

}
