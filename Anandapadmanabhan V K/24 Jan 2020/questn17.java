class demo100
{
	static int x;
	static void setting()
	{
		x=5;
	}
	static void retrieve()
	{
		System.out.println(x);
	}
}
public class questn17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo100 obj=new demo100();
		obj.setting();
		obj.retrieve();
		
	}

}
