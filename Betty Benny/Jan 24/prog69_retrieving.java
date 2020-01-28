class stat1
{
	static int x;
	
	static void setting()
	{
		x=10;
	}
	
	static void retrieve()
	{
		System.out.println(x);
	}
	
}
public class prog69_retrieving {

	public static void main(String[] args)
	{
		stat1 obj=new stat1();
		obj.setting();
		obj.retrieve();

		// TODO Auto-generated method stub

	}

}
