package gokul;
class a
{
	int i=100;
}

class b extends a
{
	void dispalay()
	{
		System.out.println(i);
	}
	
}
public class program58_subclass 
{

	public static void main(String[] args) 
	{
		b obj=new b();
		obj.dispalay();
		

	}

}
