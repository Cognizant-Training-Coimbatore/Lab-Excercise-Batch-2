class d1
{
	int a=7;
}
class d2 extends d1
{
	int a=4;
	void display() 
	{
	System.out.println(super.a);
	}
	
}
public class prog50_suoerkeyword 
{

	public static void main(String[] args) 
	{
		d2 ob=new d2();
		ob.display();

	}

}
