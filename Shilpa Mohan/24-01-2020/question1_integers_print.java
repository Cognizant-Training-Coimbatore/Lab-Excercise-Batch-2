import java.util.Scanner;

class list_integers
{
	int a;
	int b;
	void display()
	{
		int i;
		for(i=a;i<=b;i++)
		{
		System.out.println(a);
		a++;
		}
	}
}
public class question1_integers_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		list_integers obj = new list_integers();
		System.out.println("Enter two integers:");
		obj.a=sc.nextInt();
		obj.b=sc.nextInt();
		obj.display();

	}

}
