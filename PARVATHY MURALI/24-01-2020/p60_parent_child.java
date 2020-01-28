class parent
{
	void disp()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	void dis()
	{
		System.out.println("This is child class");
	}
}
public class p60_parent_child 
{

	public static void main(String[] args) 
	{
		parent p=new parent();
		child c=new child();
		p.disp();
		c.dis();
		c.disp();

	}

}
