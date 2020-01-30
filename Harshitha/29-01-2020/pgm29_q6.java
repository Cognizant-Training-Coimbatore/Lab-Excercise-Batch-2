package Project;
abstract class area1
{
int length=4,breadth=3;
abstract void area();
}
class rectangle1 extends area1
{

	@Override
	void area() {
		int a=2*length*breadth;
		System.out.println("Area of rectangle  :"+a);
		
	}
	
}
class square extends area1
{

	@Override
	void area() {
		int a1=length*breadth;
		System.out.println("Area of square="+a1);
		
	}
	
}
public class pgm29_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle1 obj1=new rectangle1();
		obj1.area();
		square obj2=new square();
		obj2.area();
	}

}

