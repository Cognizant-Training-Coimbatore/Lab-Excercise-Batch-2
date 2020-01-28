class a1
{
	int x=10;
}
class a2 extends a1
{
	
	int x=100;
	void display()
	{
		System.out.println(super.x);
	}
}
public class program39_superkeyword {

	public static void main(String[] args) 
	{
		a2 obj= new a2();
		obj.display();

	}

}
