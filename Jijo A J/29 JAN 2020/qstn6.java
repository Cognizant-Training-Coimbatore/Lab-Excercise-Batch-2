abstract class shape
{ abstract void draw();

}
class Rect extends shape
{ 
	void draw() 
	{
	System.out.println("Drawing a rectangle");
}

}
class qstn6
{
	public static void main(String args[])
	{ shape r1 = new Rect();
	r1.draw(); } 
	}

