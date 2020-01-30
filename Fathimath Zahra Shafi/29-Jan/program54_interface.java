interface myinterface1
{
	void add(); //no implementation of method in interface.Only signature.
	
	int findGreatest(int x,int y);
	int x=5; //static final by default in interface.
	default void compareNumber() //use keyword default to implement method within interface
	{
		if(x==5)
			System.out.println("x  is 5");
	}
	
	
	
}



 class abc implements myinterface1{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x);
		
	}

	@Override
	public int findGreatest(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	 
	 
	
}





public class program54_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
