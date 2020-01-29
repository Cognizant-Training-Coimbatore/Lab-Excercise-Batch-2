package javasersion8;
interface test
{
	void square();
}
class arithmetic implements test
{
	public void square()
	{
		System.out.println("Square method");
	}
}


public class ToTestInt_Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic obj=new arithmetic();
		obj.square();
	}
	

}
