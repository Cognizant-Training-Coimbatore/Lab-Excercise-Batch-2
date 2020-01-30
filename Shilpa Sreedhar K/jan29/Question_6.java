package jan29;
abstract class A10
{
	int length=10, width=5;
	abstract void area();
}
class B10 extends A10
{
	int area;
	void area()
	{
		area=length*width;
		System.out.println(area);
	}
}
public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B10 obj=new B10();
		obj.area();
	}

}