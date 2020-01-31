package pack;
interface test
{
	void square();
}
class arithmetic implements test
{

	@Override
	public void square() 
	{
		int l=5;
		System.out.println("Area:"+l*l);
		
	}
	
}
class ToTestInt 
{
	arithmetic ob=new arithmetic();
	
}
	

public class test_interface {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ToTestInt obj=new ToTestInt ();
		obj.ob.square();
		
		

	

	
	}

}
