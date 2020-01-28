class a
{
	int x=10;
}
class b extends a
{
	int y=20;
	void disp()
	{
		System.out.println(x+y);
	}
	
}
public class p58_abinherit 
{

	public static void main(String[] args)
	{
		b ob=new b();
		ob.disp();

	}

}
