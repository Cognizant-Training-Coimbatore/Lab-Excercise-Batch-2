import java.util.Scanner;

class Areas
{
	void ar(int x)
	{
		System.out.println("Area of square : "+x*x);
	}
	void ar(int x,int y)
	{
		System.out.println("Area of Rectangle : "+x*y);
	}
}
public class pgm38_sqrec {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Areas are= new Areas();
		are.ar(4);
		are.ar(4, 5);
	}
}
