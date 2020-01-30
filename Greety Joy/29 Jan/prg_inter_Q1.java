package project1;
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
public class pgmex1_inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rec=new rectangle();
		sportcar sc = new sportcar();
		manager mn = new manager();
		rec.print();
		sc.print();
		mn.print();
	}

}
