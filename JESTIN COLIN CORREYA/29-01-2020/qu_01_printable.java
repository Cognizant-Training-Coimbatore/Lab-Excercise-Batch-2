package other;
interface printable
{
	public void printn(String s);
}
class rectangle implements printable
{
	public void printn(String s) 
	{
		System.out.println("rectangle");
	}
}
class sportcar implements printable
{
	public void printn(String s)
	{
		System.out.println("sport car");
	}
}
class manager implements printable
{
	public void printn(String s)
	{
		System.out.println("manager");
	}
}
public class qu_01_printable
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
printable obj=new rectangle(); {
	obj.printn("rectangle implements");
	printable obj1=new sportcar();
	obj1.printn("sportcar implements");
	printable obj2=new manager();
	obj2.printn("manager implements");
	
}
	}
}

