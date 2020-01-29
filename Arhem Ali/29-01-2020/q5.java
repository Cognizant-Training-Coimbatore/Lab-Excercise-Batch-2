package newjava;
interface a
{
	void display();
}
class m1 implements a
{
	static class inner
	{
		 public void display()
		{
			System.out.println("display2");
		}
	}

	@Override
	public void display() {
		System.out.println("fgfg");
	}
	
	
}
public class q5 {

	public static void main(String[] args) 
	{

		m1 ob1=new m1();
		ob1.display();
		m1.inner ob=new m1.inner();
		ob.display();
	}

}
