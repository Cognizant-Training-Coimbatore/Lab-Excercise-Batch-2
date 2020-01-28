class area2
{
	int x,y;
	void areas(int l,int b)
	{
		x=l;
		y=b;
		System.out.println("Area of rectangale = " +(x*y));
		
	}
	void areas(int s)
	{
		x=s;
		System.out.println("area of square= " +x*x);
		
	}
	
}
public class prog43_area_square {

	public static void main(String[] args) {
		area2 obj=new area2();
		obj.areas(2,3);
		obj.areas(4);
		// TODO Auto-generated method stub

	}

}
