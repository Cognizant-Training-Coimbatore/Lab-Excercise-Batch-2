import java.util.Scanner;

class resq
{
	void rec(int a,int b)
	{
		int d=a*b;
		System.out.println("area of rect= "+d);
	}
	void rec(int a)
	{
		int d=a*a;
		System.out.println("area of square= "+d);
	}
}
public class program39_area_squ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter l and b for rect");
int l=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter l for square");
int g=sc.nextInt();
resq obj=new resq();
obj.rec(l,b);
obj.rec(g);
	}

}
