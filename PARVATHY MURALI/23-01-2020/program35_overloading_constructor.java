class constclass
{
	int x,y;
	constclass()
	{
		x=10;
		y=20;
	}
	constclass(int a,int b)
	{
		x=a;
		y=b;
		
	}
	void display()
	{
		System.out.println(x+y);
	}
}
public class program35_overloading_constructor 
{

	public static void main(String[] args) 
	{
		constclass ob=new constclass();
		constclass ob1=new constclass(67,78);
		ob.display();
		ob1.display();

	}

}
