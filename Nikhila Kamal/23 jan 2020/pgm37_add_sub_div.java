import java.util.Scanner;

class arith
{
	int a,b,s;
	arith(int x,int y)
	{
		a=x;
		b=y;
	}
	void res()
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
	}
}
public class pgm37_add_sub_div {

	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		System.out.println("enter second number");
		Scanner s=new Scanner(System.in);
		int z=s.nextInt();
		arith obj=new arith(w,z);
		
		obj.res();
		
		
		

	}

}
