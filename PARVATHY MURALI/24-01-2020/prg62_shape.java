class shape
{
	void dispaly()
	{
		System.out.println("This is shape");
	}
}
class circle extends shape
{
	void dispalyc()
	{
		System.out.println("This is circular shape");
	}
}
class rectangle extends shape
{
	void displayr()
	{
		System.out.println("This is rectangular shape");
	}
}
class square extends rectangle
{
	void dispalys()
	{
		System.out.println("Square is a rectangle");
	}
}
public class prg62_shape {

	public static void main(String[] args) {
		square ob=new square();
		ob.dispaly();
		ob.displayr();

	}

}
