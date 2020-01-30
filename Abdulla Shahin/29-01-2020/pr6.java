abstract class shape
{
	abstract void draw();
}
class circle extends shape
{
	void draw()
	{
			System.out.println("Circle");
	}
}
public class pr6 {

	public static void main(String[] args)
	{
		shape obj=new circle();
		obj.draw();

	}

}