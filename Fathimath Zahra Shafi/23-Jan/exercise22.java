class ar
{
	int l,b,a,area=0;
	void area(int l,int b) {
		area=l*b;
		System.out.println("area of rectangle: " +area);
	}
	
	void area(int a)
	{
		area=a*a;
		System.out.println("area of square: " +area);
		
	}
}
public class exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ar obj=new ar();
		obj.area(8,9);
		obj.area(3);

	}

}
