package other;
interface test
{
	void square(int a);
}
class arithmetic implements test
{
	public void square(int a )
	{
		System.out.println("area="+a*a);
	}
}
public class qu_04_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test obj=new arithmetic();
obj.square(2);
	}

}
