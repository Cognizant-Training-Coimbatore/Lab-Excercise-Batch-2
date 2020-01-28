class stati
{
	static int x;
	static void set()
	{
		 x=7;
	}
	static int retrieve()
	{
		return x;
	}
}
public class qu7 {

	public static void main(String[] args) {
		stati ob=new stati();
		ob.set();
		int y=ob.retrieve();
		System.out.println(y);

	}

}
