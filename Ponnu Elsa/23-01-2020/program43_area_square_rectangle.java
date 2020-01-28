class areaof
{
	areaof(int a)
	{
		System.out.println(" Area of given square is "+(a*a));
	}
	areaof(int l,int b)
	{
		System.out.println(" Area of given rectangle is "+(l*b));
	}
}
public class program43_area_square_rectangle {

	public static void main(String[] args)
	{
		areaof obj = new areaof(4);
		areaof obj1=new areaof(5,6);

	}

}