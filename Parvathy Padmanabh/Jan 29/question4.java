interface test
{
	void square();
	int side =30;
}
class arithmetic implements test
{
	int area;
	public void square()
	{
		area = side*side;
	}
}
class ToTestInt extends arithmetic
{
	void display()
	{
		square();
		System.out.println("Area : " + area);
	}
}
public class question4 {

	public static void main(String[] args)
	{
		ToTestInt obj = new ToTestInt();
		obj.display();

	}

}
