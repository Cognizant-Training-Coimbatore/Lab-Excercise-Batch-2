package project1;
interface p1
{
	default void display()
	{
		System.out.println("This is p1");
	}
}
interface p2
{
	default void display()
	{
		System.out.println("This is p2");
	}
}
class P implements p1,p2

{
	public void display()
	{
		System.out.println("This is P class");
		p1.super.display();
		p2.super.display();
	}
}
public class prgd29_q3_multipleinheritance {

	public static void main(String[] args) {
	
  P obj=new P();
  obj.display();
	}

}
