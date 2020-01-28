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
public class program61_stat_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat1 obj=new stat1();
		obj.setting();
		obj.retrieve();
	}

}
