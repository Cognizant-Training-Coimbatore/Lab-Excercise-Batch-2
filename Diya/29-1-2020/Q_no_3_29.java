package Project1;

interface B
{
	void print();
}
class C
{
	void print1()
	{
		System.out.println("Inside class C...");
	}
}
class child extends C implements B
{
	public void print()
	{
		System.out.println("Inside interface....");
	}
}
public class Q_no_3_29 {

	public static void main(String[] args) 
	{
		child ch = new child();
		ch.print();
		ch.print1();
	}

}
