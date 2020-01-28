package demo;

class superclass
{
	int x=10;
}
class subclass extends superclass
{
	int x=100;
	void display()
	{
		System.out.println(x);// overriding
		System.out.println(super.x);// superclass's x
	}
	
}
public class program26_super_keyword 
{	 public static void main(String[] args)
	{
		subclass obj=new subclass();
		obj.display();
	}
 
}
