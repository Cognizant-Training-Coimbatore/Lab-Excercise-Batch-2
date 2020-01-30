class Area
{
	double length;
	double breadth;
	double returnArea(double l,double b)
	{
		double area=l*b;
		return area;
		//System.out.println("Area: "+area);
	}
}
public class program36_area {

	public static void main(String[] args) {
		Area obj=new Area();
		double a=obj.returnArea(3, 4);
		System.out.println("Area: "+a);
		
	}

}
