class demo1
{
	static int x;
	static void setting()
	{
		x=7;
	}
	static void retrieve()
	{
		System.out.println(x);
	}
}
public class qu17 {

	public static void main(String[] args)
	{
		demo1 obj = new demo1();
		obj.setting();
		obj.retrieve();
		
	}

}
