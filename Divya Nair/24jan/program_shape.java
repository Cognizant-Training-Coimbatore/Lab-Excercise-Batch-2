class Shape
{
	void display()
	{
		System.out.println("This is shape");
		
	}
}
class rectangle extends Shape
{
	void show()
	{
		System.out.println("This is Rectangle shape");
	}
}
class circle extends Shape
{
	void all()
	{
		System.out.println("This is circular shape");
	}
}
class square extends rectangle
{
	void a()
	{
		System.out.println("square is rectangle");
		display();
		show();
	}
}
public class program_shape {
	public static void main(String args[])
	{
		circle obj=new circle();
		obj.all();
		square obj1=new square();
		obj1.a();
		
		
	}

}
