package Exercise;

interface test{
	void square();
}
class arithmetic implements test
{
	public void square()
	{
		System.out.println("hi");
	}
	class ToTestInt{
		
	}
}
public class Interface_Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arithmetic obj = new arithmetic();
		obj.square();
	}

}
