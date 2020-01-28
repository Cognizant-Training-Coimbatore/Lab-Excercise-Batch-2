import java.util.Scanner;

class area
{
	int l,b;
	void  rec()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		l=sc.nextInt();
		System.out.println("enter the breadth");
		b=sc.nextInt();
	}
	int returnarea()
	{
	int d=l*b;
	return d;
	}
}
public class program34_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
area obj=new area();
obj.rec();
obj.returnarea();
System.out.println("area = "+obj.returnarea());
	}

}
