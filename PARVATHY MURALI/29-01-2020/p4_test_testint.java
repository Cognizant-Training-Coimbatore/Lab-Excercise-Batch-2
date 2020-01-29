package packone;
interface test
{
	void square();
}
class arithmetic implements test
{
	int length=2;
	public void square()
	{
		System.out.println("Area"+length*length);
	}
}
class TesttoInt
{
	arithmetic ob=new arithmetic();
	
}
public class p4_test_testint {

	public static void main(String[] args) {
		TesttoInt obj=new TesttoInt();
		obj.ob.square();

	}

}
