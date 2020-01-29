package abc;
abstract class shape
{
	int l=2,b=2,r=10;
	abstract void calcarea();
	abstract void disarea();
	void dummymodule()
	{
		System.out.println("dummy module");
	}
}
class rec extends shape
{
	int area;
	void calcarea()
	{
		area=l*b;
	}
	void disarea() {
		System.out.println("rectangle "+area);
	}}
public class date29_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			rec obj1=new rec();
			obj1.calcarea();
			obj1.disarea();
	}

}
