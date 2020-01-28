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
public class program66_question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat1 obj=new stat1();
		obj.setting();
		obj.retrieve();

	}

}