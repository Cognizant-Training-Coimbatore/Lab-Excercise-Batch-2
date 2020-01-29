interface myinterface1
{
	void add();		// cannot create normal method
	int findGreat(int x,int y);
	default void compare() // default keyword is used to define the function
	{
		
	}
	int x=5, y=6;		//static final variable
}
class newclass implements myinterface1
{

	@Override
	public void add() 
	{
		
		System.out.println(x);
		
	}

	@Override
	public int findGreat(int x, int y) {
		
		return 0;
	}	
	
	
}
public class interface_class {

	public static void main(String[] args) 
	{
		
		

	}

}
