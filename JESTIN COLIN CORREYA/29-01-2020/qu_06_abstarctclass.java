package other;	
abstract class shape
{
	int l=2,w=2,r=10;
	abstract void calcuarea();
	abstract void displayarea();
	void dummymodule()
	{
		System.out.println("dummy module");

	}
}
	class Rectangle11 extends shape
	{
		int area;
		void calcuarea() 
		{
			area =l*w;
		}
		void displayarea()
		{
			System.out.println("rectangle"+area);
		}
	}
	class circle extends shape
	{
		float area;
		void calcuarea() {
			area=3.14f*r*r;
		}
		void displayarea() {
			System.out.println("circle:"+area);
			
		}
	}
	class square extends shape
	{
		int area;
		void calcuarea()
		{
			area=l*l;
		}
		void displayarea()
		{
			System.out.println("square"+area);
		}
	}
	public class qu_06_abstarctclass{




	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape obj =new Rectangle11();
obj.calcuarea();
obj.displayarea();
circle obj1=new circle();
obj1.calcuarea();
obj1.displayarea();
square obj2=new square();
obj2.calcuarea();
obj2.displayarea();
	}

}
