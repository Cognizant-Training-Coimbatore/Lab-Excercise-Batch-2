package project1;
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
public class pgmex3_multiinher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch = new child();
		ch.print();
		ch.print1();
	}

}
