package Project1;
abstract class shape
	{
		int length=2,width=2;
		abstract void calculatearea();
		abstract void displayarea();
		void dummymodule()
		{
			System.out.println("dummy module...");
		}
	}
	class rectangle1 extends shape
	{
		int area;
		void calculatearea()
		{
			area=length*width;
		}
		void displayarea()
		{
			System.out.println("Rectangle.."+area);
		}
	}
	public class Q_no_6_29 {

		public static void main(String[] args) {
			rectangle1 obj1=new rectangle1();
			obj1.calculatearea();
			obj1.displayarea();
		}

	}
