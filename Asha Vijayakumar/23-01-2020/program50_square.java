class figure
{	int a,b;
	void fig(int a,int b)
	{
		System.out.println("The area of rectangle is:" + a*b);
	}
	void fig(int a)
	{
		System.out.println("The area of square is:" + a*a);
	}
}
public class program50_square {

	public static void main(String[] args)
	{
		figure obj = new figure();
		obj.fig(3,5);
		obj.fig(3);
		// TODO Auto-generated method stub

	}

}
