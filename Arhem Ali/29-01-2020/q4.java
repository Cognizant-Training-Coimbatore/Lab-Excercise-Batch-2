package newjava;
class totestint 
{
	int y;
	 void disp()
	{
		System.out.println("mm");
	}
}
interface test
{
	void square();
}
class arithmatic extends totestint implements test
{
	public void square()
	{
		System.out.println("ok");
	}
}

	
public class q4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		arithmatic ob=new arithmatic();
		ob.disp();
		
	}
}
