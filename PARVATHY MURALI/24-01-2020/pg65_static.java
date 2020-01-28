class stst
{
	static int i=0;
	static  int meth_static(int y)
	{
		return y=100;
	}
	
}
public class pg65_static {

	public static void main(String[] args)
	{
		
		stst ob=new stst();
		ob.i=1;
		int c=ob.meth_static(30);
		int f=ob.b=5;
		System.out.println("Static method result: "+c);
		System.out.println("Static variable result: "+ob.i);
	
	}

}
