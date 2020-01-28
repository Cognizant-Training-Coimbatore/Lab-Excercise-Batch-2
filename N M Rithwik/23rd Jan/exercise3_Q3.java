import java.util.Scanner;

class area
{
	int calculate(int a, int b)
	{
		int ar;
		ar=a*b;
		return ar;
	}
}
public class exercise3_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length : ");
		l = sc.nextInt();
		System.out.println("enter breadth ; ");
		b = sc.nextInt();
		area obj = new area();
		ans=obj.calculate(l, b);
		System.out.println("Area = " + ans);
	}

}
