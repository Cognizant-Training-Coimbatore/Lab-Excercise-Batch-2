import java.util.Scanner;

class Area0
{
	int res=0;
	void area(int x)
	{
		res=x*x;
		System.out.println(res);
	}
	void area(int x,int y)
	{
		res=x*y;
		System.out.println(res);
	}
}
public class q10 {

	public static void main(String[] args)
	{
		Area0 obj = new Area0();
		obj.area(4);
		obj.area(4, 3);
	}

}
