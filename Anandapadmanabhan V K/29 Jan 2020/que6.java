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
public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape obj=new circle();
		obj.draw();

	}

}