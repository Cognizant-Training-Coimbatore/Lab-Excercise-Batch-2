class demo
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
public class pgm_retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo obj=new demo();
obj.setting();
obj.retrieve();

	

	}

}
