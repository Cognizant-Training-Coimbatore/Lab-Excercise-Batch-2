import java.util.Scanner;

class area
{
	int l,b;
	area(int p,int q)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter length");
		l = s.nextInt();
		System.out.println("enter breadth");
		b = s.nextInt();
		
	}
	void returnArea()
	{
		System.out.println(l*b);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area obj=new area(5,10);
		obj.returnArea();
		

	}

}
