class x1
{
	int a=2;
}
class x2 extends x1
{
	int b=5;
	void display()
	{
		  System.out.println(a+b);
	}
}
	class x3 extends x1
	{
		int c=10;
		void display()
		{
			  System.out.println(a+c);
		}
	}
		class x4 extends x1
		{
			int d=100;
			void display()
			{
				  System.out.println(a+d);
			}
			
		}
		
	

public class in2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
x2 o=new x2();
o.display();
x3 o1=new x3();
o1.display();
x4 o2=new x4();
o2.display();
	}

}
