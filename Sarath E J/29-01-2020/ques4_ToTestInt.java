package sample;
interface test
{
	void square(int a);
}
class arithmetic implements test
{
	public void square(int a)
	{
		System.out.println("Square is : "+(a*a));
	}
}
	
public class ques4_ToTestInt 
{

	public static void main(String[] args)
	{
		arithmetic ob = new arithmetic();
		ob.square(2);
		
	}

}
