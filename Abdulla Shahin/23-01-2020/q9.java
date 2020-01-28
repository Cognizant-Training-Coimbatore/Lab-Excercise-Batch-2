import java.util.Scanner;

class order
{
	void display(int n, char c)
	{
		System.out.println(n);
		System.out.println(c);
	}
	void display(char c, int n )
	{
		System.out.println(c);
		System.out.println(n);
	}
}
public class q9 {

	public static void main(String[] args)
	{
		order obj = new order();
		obj.display(3,'d');
		obj.display('d', 3);

	}

}
