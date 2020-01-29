interface A1
{
	int x=1;
}
interface B1
{
	int y=2;
}
class berthe implements A1,B1
{
	int result=x+y;
	public void display()
	{
		System.out.println(result);
	}
}
public class pr3 {

	public static void main(String[] args) 
	{
		berthe obj = new berthe();
		obj.display();
	}

}
