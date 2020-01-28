import java.util.Scanner;

class result
{
	void add(int x,int y)
	{
		int a = x+y;
		System.out.println("ADDITION: "+a);
	}
	void sub(int x, int y)
	{
		int s= x-y;
		System.out.println("SUBTRATCTION: "+s);
	}
	void mul(int x,int y)
	{
		int mul=x*y;
		System.out.println("MULTIPLICAYION: "+mul);
	}
	void division(int x,int y)
	{
		double div=x/y;
		System.out.println("DIVISION: "+div);
	}
}
	

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fst number: ");
		int a= sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		result ob= new result();
		ob.add(a,b);
		ob.sub(a,b);
		ob.mul(a, b);
		ob.division(a,b);
	    

	}

}
