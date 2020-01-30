package project1;
abstract class sha1
{ abstract void draw();

}
class Rect extends sha1
{ 
	void draw() 
	{
	System.out.println("Drawing a rectangle");
}

}
class ex7_Q6
{
	public static void main(String args[])
	{ sha1 r1 = new Rect();
	r1.draw(); } 
	}
