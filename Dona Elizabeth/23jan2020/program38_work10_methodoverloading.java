class Area1
{
	double l,b;
	void area(double len,double bre)
	{
		double a=len*bre;
		System.out.println("Area of rectangle: "+a);
	}
	void area(double len)
	{
		double a=len*len;
		System.out.println("Area of square: "+a);
	}
}
public class program38_work10_methodoverloading {

	public static void main(String[] args) {
		Area1 obj=new Area1();
		obj.area(3,4);
		obj.area(2);
	}
}
