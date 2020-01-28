class arrea
{
	void display(int l,int b)
	{
		int ar=l*b;
		System.out.println("area of rectangle: " + ar);
		}
	void display(int a)
	{
		int as=a*a;
		System.out.println("area of square:" + as);
	}
}
public class pgm42_area_rect_square {

	public static void main(String[] args) {
	arrea obj=new arrea();
	obj.display(4,3);
	obj.display(4);

	}

}
