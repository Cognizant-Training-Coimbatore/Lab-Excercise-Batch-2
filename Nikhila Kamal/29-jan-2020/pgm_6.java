abstract class shape
{ 
	abstract void draw();

}
class Rect extends shape
{ 
	void draw() 
	{
	System.out.println("Hello");
}

}
class pgm_6
{
	public static void main(String args[])
	{ 
		shape obj= new Rect();
		obj.draw(); } 
	}
