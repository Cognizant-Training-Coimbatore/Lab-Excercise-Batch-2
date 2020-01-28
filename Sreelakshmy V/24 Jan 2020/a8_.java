import java.util.Scanner;

class Programming
{

	void none()
	{
		System.out.println("I love programming");
	}
	

	void pro(String s)
	{
		System.out.println("I love"+s);
	}
}
public class a8_ {

	public static void main(String[] args) {
		String z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		z=sc.nextLine();
		Programming ob=new Programming();
		if(z==null)
		{
		
		ob.none();
		System.exit(0);
		}
		else
			ob.pro(z);

	

}
}