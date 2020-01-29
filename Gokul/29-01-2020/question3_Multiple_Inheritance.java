interface a1
{
	void area();
	
}
interface a2
{
	void display();
}

class area_display implements a1,a2
{
	public void area()
	{
		int length=10;
		int breadth=10;
		int area=length*breadth;
		display(area);
	}
	public void display(int a)
	{
		System.out.println("Area:"+a);
	}
}
public class question3_Multiple_Inheritance {

	public static void main(String[] args) 
	{
		area_display a=new area_display();
		a.area();

	}

}
