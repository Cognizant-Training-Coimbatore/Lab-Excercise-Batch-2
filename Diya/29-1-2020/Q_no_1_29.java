package Project1;

interface Printable
{
	void print();
}
class rectangle implements Printable
{
	public void print()
	{
		System.out.println("Rectangle");
	}
}
class sportcar implements Printable
{
	public void print()
	{
		System.out.println("Sportscar");
	}
}
class manager implements Printable
{
	public void print()
	{
		System.out.println("Manager");
	}
}
public class  Q_no_1_29  {

	public static void main(String[] args) {
		rectangle rec=new rectangle();
		sportcar sc = new sportcar();
		manager mn = new manager();
		rec.print();
		sc.print();
		mn.print();
	}

}
