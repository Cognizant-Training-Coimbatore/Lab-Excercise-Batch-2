import java.util.Scanner;

class area2
{
	int l,b,area;
	void area1(int x,int y)
	{
		l=x;
		b=y;
	}
	void returnArea()
	{
	System.out.println("Area= " + l*b);	
	}
}
public class q3_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int p=sc.nextInt();
		System.out.println("Enter the breadth");
		int q=sc.nextInt();
		area2 obj=new area2();
		obj.area1(p,q);
		obj.returnArea();
		
	}

}
