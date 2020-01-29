interface test
{
	int x=5;
	void square(int x);
	
}
class ArithmeticClass implements test
{
	public void square(int x)
	{

		int area=x*x;
		display(area);
	}
	void display(int area)
	{
		System.out.println("Area:"+area);
	}
}
class ToTestInt extends ArithmeticClass
{
	square(int x);

	
}
public class question4_test {

	public static void main(String[] args) {
	ToTestInt t=new ToTestInt();
	t.square(10);
	t.display(10);
	}

}
