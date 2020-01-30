package project1;

abstract class sha
{ abstract void draw();

}
class Rec extends sha
{ 
	void draw() 
	{
	System.out.println("Drawing a rectangle");
}

}
public class jan29_q6
{
	public static void main(String args[])
	{ sha r1 = new Rec();
	r1.draw(); } 
	}