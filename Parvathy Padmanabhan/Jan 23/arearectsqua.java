class arearect
{
	int area;
	int area(int a)
	{
		return area=a*a;
	}
	int area(int a, int b)
	{
		return area=a*b;
	}
}
public class arearectsqua {

	public static void main(String[] args) {
		arearect obj=new arearect();
		int result=obj.area(5);
		System.out.println("Area of square "+result);
		result = obj.area(2,5);
		System.out.println("Area of rectangle "+result);
	}

}
