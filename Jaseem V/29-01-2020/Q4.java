package exercise;
interface test
{
	void square(int x);
}
class arithmetic implements test
{
	public void square(int x)
	{
		System.out.println("area="+x*x);
	}
}
public class Q4 {

	public static void main(String[] args)
	{
		
test obj=new arithmetic();
obj.square(5);
	}

}