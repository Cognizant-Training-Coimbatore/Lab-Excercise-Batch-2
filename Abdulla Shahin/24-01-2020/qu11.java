class a
{
	int x=2;
}
class b extends a
{
	int y=3;
	int c=x+y;
	void display()
	{
		System.out.println(c);
	}
	
}
public class qu11 {

	public static void main(String[] args) 
	{
		b obj = new b();
		obj.display();
		

	}

}
