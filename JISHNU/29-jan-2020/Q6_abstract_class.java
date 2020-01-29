package javasersion8;
abstract class Anew
{
	int length=10, width=5;
	abstract void area();
}
class Bnew extends Anew
{
	int area;
	void area()
	{
		area=length*width;
		System.out.println(area);
	}
}
public class Q6_abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bnew obj=new Bnew();
		obj.area();
	}

}
