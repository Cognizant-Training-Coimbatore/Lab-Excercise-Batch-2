class shape
{
	void print()
	{
		System.out.println("This is a shape");
	}
	
}
class rectangle extends shape
{
	void print2()
	{
		System.out.println("This is a rectangular shape");
	}
}
class circle extends shape
{
	void print3()
	{
		System.out.println("This is crcular shape");
	}
}
class square extends rectangle
{
	void print4()
	{
		System.out.println("Square is a rectangle");
	}
}
public class Q15 {

	public static void main(String[] args) {
	square obj=new square();
	obj.print();
	obj.print2();

	}

}
