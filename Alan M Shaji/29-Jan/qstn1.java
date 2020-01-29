package apache;
interface printable
{
	public void print(String str);
}
class Rectangle implements printable
{
	public void print(String str)
	{
		System.out.println(str);
	}
}
class Manager implements printable
{
	public void print(String str)
	{
		System.out.println(str);
	}
}
class Sportcar implements printable
{
	public void print(String str)
	{
		System.out.println("Rectangle class implements printable");
	}
}
public class qstn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printable obj1=new Rectangle();
		obj1.print("Rectangle class implements printable");
		printable obj2=new Manager();
		obj2.print("Manager class implements printable");
		printable obj3=new Sportcar();
		obj3.print("Sportcar class implements printable");
	}

}
