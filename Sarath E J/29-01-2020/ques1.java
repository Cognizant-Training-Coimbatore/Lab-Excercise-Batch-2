package sample;
interface printable
{
	void print();
}
class Rectangle implements printable
{
	public void print()
	{
		System.out.println("this is rectangle");
	}
}
class Sportscar implements printable
{
	public void print()
	{
		System.out.println("this is sports car");
	}
}
class Manager implements printable
{
	public void print()
	{
		System.out.println("this is Manager class");
	}
}
public class ques1 {

	public static void main(String[] args) 
	{
		Rectangle ob1 = new Rectangle();
		ob1.print();
		Sportscar ob2 = new Sportscar();
		ob2.print();
		Manager ob3 = new Manager();
		ob3.print();
	}

}
