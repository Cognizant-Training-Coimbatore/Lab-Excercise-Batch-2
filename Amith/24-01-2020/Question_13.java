class pc
{
	void print1()
	{
		System.out.println("this is parent class");
	}
}
class child extends pc
{
	void print2()
	{
		System.out.println("this is child class");
	}
	
	
}
public class Question_13 {

	public static void main(String[] args)
	{
	pc obj1=new pc();
	child obj2= new child();
	obj1.print1();
	obj2.print2();
	obj2.print1();

	}

}
