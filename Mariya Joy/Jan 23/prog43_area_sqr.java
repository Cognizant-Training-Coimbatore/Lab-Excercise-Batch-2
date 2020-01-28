class area2
{
	int a,c;
	void arearo(int l,int b)
	{
		a=l;
		c=b;
		System.out.println("The area of rectangle= "+(a*c));
	}
	void arearo(int s)
	{
		a=s;
		System.out.println("The area of square= "+(a*a));
	}
}
public class prog43_area_sqr {

	public static void main(String[] args) {
		area2 obj=new area2();
		obj.arearo(3,4);
		obj.arearo(3);
		// TODO Auto-generated method stub

	}

}
