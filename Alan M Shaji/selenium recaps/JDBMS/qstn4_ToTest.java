package apache;
interface test
{
	void square(int a);
}
class Arithmetic implements test
{
	public void square(int a)
	{
		System.out.println(a*a);
	}
}
public class qstn4_ToTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj=new Arithmetic();
		obj.square(34);

	}

}
