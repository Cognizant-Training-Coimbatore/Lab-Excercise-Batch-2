package demo;

class sample
{
	void disp1()
	{
		System.out.println("Display 1 is running..");
		disp2(); //nesting of method
	}
	void disp2()
	{
		System.out.println("Display 2 is running..");
	}
}
public class program24_nesting_of_methods
{

	public static void main(String[] args) 
	{
		sample ob=new sample();
		ob.disp1();
		ob.disp2();
	}

}
