package demo;
class parent
{
	void display()
	{
		System.out.println("This is parent");
	}
  }
class child extends parent
{    
	void display1()
	{
		System.out.println("This is child");
	}

	
  }

public class ex3_Q2 {

	public static void main(String[] args) {
	
		parent p=new parent();
		child c=new child();
		p.display();
		c.display1();
		c.display();

	}

}
