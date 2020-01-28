class shape{
	String x="This is shape";
	void display1()
	{
		System.out.println("This is "+x);
	}
}
class rectangle extends shape
{
	String x="this is rectangle";
	void display2()
	{
		System.out.println("This is "+x);
	}
	}
class Circle extends shape
{
	String x="this is rectangle";
	void display3()
	{
		System.out.println("This is "+x);
	}	}
class Square extends rectangle
{
	void display4()
	{
		System.out.println("square is rectangle ");
	}
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square xx=new Square();
xx.display1();
xx.display2();
xx.display4();
	
	}

}