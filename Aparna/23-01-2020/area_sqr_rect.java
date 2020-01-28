class area123
{
	int a, b;
	void z(int x,int y)
	{
		a=x;
		b=y;
		int rect=a*b;
		System.out.println("rectangle area is "+rect);
	}
	void z(int x)
	{
		x=a;
		int sqr=a*a;
		System.out.println("square area is  " +sqr);
	}
}
public class area_sqr_rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area123 obj=new area123();
		obj.z(3,4);
		obj.z(3);
	}
}
