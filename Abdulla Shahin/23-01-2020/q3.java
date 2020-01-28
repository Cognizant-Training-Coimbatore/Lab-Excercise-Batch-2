import java.util.Scanner;

class Area
{
	int res;
	void returnArea(int x , int y)
	{
		res=x*y;
		System.out.println(res);
	}
}
public class q3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length:");
		int a=sc.nextInt();
		System.out.println("enter breadth:");
		int b=sc.nextInt();
		Area obj=new Area();
		obj.returnArea(a, b);
	}

}
